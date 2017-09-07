package com.pluralsight.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Flight;
import com.pluralsight.model.FlightsReport;

@Repository("flightSearchRepository")
public interface FlightSearchRepository extends JpaRepository<Flight, Integer> {

		
	@Query("Select new com.pluralsight.model.FlightsReport(r.source_id, r.destination_id, r.miles, f.date, f.departure_time, f.arrival_time, sm.vacant, sm.price, sm.seat_type, f.flight_id, r.route_id, f.fleet_id, f.carrier_id) " +  
			"from SubFlight f "+
			"inner join Route r on f.route_id = r.route_id " +
			"inner join SeatMatrix sm on f.seat_matrix = sm.seat_matrix_id " +
			"and r.source_id.airport_id = ?1 and r.destination_id.airport_id = ?2 and f.date = ?3 and sm.seat_type.seat_type = ?4 and sm.vacant >= ?5" )
	List<FlightsReport> findAllFlights(String source_airport, String destination_airport, Date date,
			String seat_class, int seats);

	
}
