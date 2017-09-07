package com.pluralsight.service;

import javax.validation.Valid;

import com.pluralsight.model.PaymentForm;
import com.pluralsight.model.UserPaymentDetails;

public interface MakePaymentService {

	UserPaymentDetails save(@Valid UserPaymentDetails userPaymentDetails);

	int[] getFare(int flight_id, String seat_class_abbrev, int seats, int user_air_miles);

	void bookFlight(@Valid PaymentForm payment);
	
	int getUserBookingId();

}