package com.fightbooking.service;

import javax.validation.Valid;

import com.flightbooking.model.UserPaymentDetails;

public interface MakePaymentService {

	UserPaymentDetails save(@Valid UserPaymentDetails userPaymentDetails);

}