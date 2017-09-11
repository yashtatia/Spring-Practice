package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.MyBookingsReport;
import com.pluralsight.model.UserPaymentDetails;

public interface MyBookingsService {

	List<MyBookingsReport> findAllBookings(String username);

	void cancelBooking(int bookingId);

	UserPaymentDetails findOne(int bookingId);

}