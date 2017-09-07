package com.fightbooking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.model.UserPaymentDetails;
import com.flightbooking.repository.MakePaymentRepository;

@Service("makePaymentService")
public class MakePaymentServiceImpl implements MakePaymentService {
	
	@Autowired
	private MakePaymentRepository makePaymentRepository;
	
	@Override
	@Transactional
	public UserPaymentDetails save(UserPaymentDetails userPaymentDetails) {
		
		userPaymentDetails = makePaymentRepository.save(userPaymentDetails);
		
		return userPaymentDetails;
	}
}
