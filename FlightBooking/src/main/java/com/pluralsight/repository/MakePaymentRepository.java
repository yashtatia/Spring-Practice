package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.UserPaymentDetails;

@Repository("makePaymentRepository")
public interface MakePaymentRepository extends JpaRepository<UserPaymentDetails, Integer> {

	@SuppressWarnings("unchecked")
	UserPaymentDetails save(UserPaymentDetails userPaymentDetails);

	@Query("Select u from UserPaymentDetails u order by u.booking_id desc")
	List<UserPaymentDetails> getId();
	
//	UserPaymentDetails findFirstByOrderByFlightidDesc();

}
