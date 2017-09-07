package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.MyBookingsReport;

public interface MyBookingsService {

	List<MyBookingsReport> findAllBookings(String username);

	void cancelBooking(int bookingId);

}