package com.pluralsight.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.MyBookingsReport;
import com.pluralsight.model.UserPaymentDetails;
import com.pluralsight.repository.MyBookingsRepository;

@Service("myBookingsService")
public class MyBookingsServiceImpl implements MyBookingsService {

	@Autowired
	private MyBookingsRepository myBookingsRepository;

	@Override
	public List<MyBookingsReport> findAllBookings(String username) {
		return myBookingsRepository.findAllBookings(username);
	}
	
	public List<UserPaymentDetails> findAll(){
		return myBookingsRepository.findAll();
	}

	@Override
	@Transactional
	public void cancelBooking(int bookingId) {
		//get booking details
		UserPaymentDetails booking = myBookingsRepository.findOne(bookingId);
		
		int user_id  = booking.getUser_id().getUser_id();
		int flight_id = booking.getFlight_id().getFlight_id();
		String seat_type = booking.getFlight_class();
		int seats = booking.getSeats();
		int miles_used = booking.getMiles_used();
		//float total_amount = booking.getTotal_amount();
		int route_miles = booking.getFlight_id().getRoute_id().getMiles();
		
		//add seats back
	    myBookingsRepository.updateSeats(flight_id, seat_type, seats);
	    System.out.println("Seats added back");
	    
	    //reclaim added miles
	    myBookingsRepository.reclaimMiles(route_miles, miles_used, user_id);
		System.out.println("miles reclaimed");
		//remove from booking
	    myBookingsRepository.delete(bookingId);
	    System.out.println("removed from booking history");
		
	}

	
}