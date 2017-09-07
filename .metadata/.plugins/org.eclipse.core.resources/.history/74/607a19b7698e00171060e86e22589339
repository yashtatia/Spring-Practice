package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.model.UserPaymentDetails;

@Repository("makePaymentRepository")
public interface MakePaymentRepository extends JpaRepository<UserPaymentDetails, Integer> {

	UserPaymentDetails save(UserPaymentDetails userPaymentDetails);
}
