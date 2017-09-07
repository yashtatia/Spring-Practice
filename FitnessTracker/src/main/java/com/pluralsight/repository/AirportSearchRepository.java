package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pluralsight.model.Airport;

public interface AirportSearchRepository extends JpaRepository<Airport, String> {

	List<Airport> findAll();
	
	
	@Query("Select a from Airport a where a.airport_name like %:query% or a.airport_id like %:query%")
	List<Airport> findAllFlights(@Param("query") String query);
	
	
	

}
