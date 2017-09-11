package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.SubFlight;

@Repository("getFareRepository")
public interface GetFareRepository extends JpaRepository<SubFlight, Integer>{

	@Query("Select f from SubFlight as f, Route as r where f.route_id = r.route_id and flight_id= ?1")
	List<SubFlight> getFlights(int flight_id);

}
