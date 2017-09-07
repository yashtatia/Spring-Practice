package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.SubFlight;

@Repository("enteringSubFlightRepository")
public interface EnteringSubFlightRepository extends JpaRepository<SubFlight, Integer>{

	@Query("Select  count(f) from SubFlight f where f.flight_id = ?1 and f.seat_matrix.seat_type.seat_type  = ?2 and f.seat_matrix.vacant >= ?3")
	int checkFlightAvailabilityRepository(int flight_id, String seat_type, int seats);
	
	@Modifying
	@Query("Update SeatMatrix sm set sm.vacant = sm.vacant - ?3 where sm.seat_type.seat_type = ?2 and sm.seat_matrix_id = (Select seat_matrix from SubFlight f where f.flight_id = ?1)")
	void updateSeats(int flight_id, String seat_type, int seats);

	SubFlight findOne(int flight_id);
	
}
