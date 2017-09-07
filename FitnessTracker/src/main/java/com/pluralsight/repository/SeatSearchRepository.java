package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.SeatType;

@Repository("seatSearchRepository")
public interface SeatSearchRepository extends JpaRepository<SeatType, String> {

	List<SeatType> findAll();
	
	

}
