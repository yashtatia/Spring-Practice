package com.pluralsight.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.pluralsight.model.PaymentForm;
import com.pluralsight.model.SubFlight;
import com.pluralsight.model.User;
import com.pluralsight.model.UserPaymentDetails;
import com.pluralsight.repository.EnteringSubFlightRepository;
import com.pluralsight.repository.GetFareRepository;
import com.pluralsight.repository.MakePaymentRepository;
import com.pluralsight.repository.SignUpRepository;

@Service("makePaymentService")
public class MakePaymentServiceImpl implements MakePaymentService {
	
	@Autowired
	private MakePaymentRepository makePaymentRepository;
	
	@Autowired
	private GetFareRepository getFareRepository; 
	
	@Autowired
	private EnteringSubFlightRepository enteringSubFlightRepository;
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	@Override
	@Transactional
	public UserPaymentDetails save(UserPaymentDetails userPaymentDetails) {
		
		userPaymentDetails = makePaymentRepository.save(userPaymentDetails);
		
		return userPaymentDetails;
	}

	@Override
	public int[] getFare(int flight_id, String seat_class_abbrev, int seats, int user_air_miles) {
		
		int op[] = new int[6];
		op[0] = calculateFare_withMiles(flight_id,seat_class_abbrev,seats,user_air_miles);
		op[1] = calculateFare_withoutMiles(flight_id,seat_class_abbrev,seats);
		// miles used
		int miles_remaining = user_air_miles - (op[1] * 2);
		if(miles_remaining < 0){
			miles_remaining = 0;
		}
		op[2] = miles_remaining;
		op[3] = getMilesEarned(flight_id);
		op[4] = user_air_miles - op[2];
		op[5] = (int)op[4]/2;

		return op;
	}

	private int getMilesEarned(int flight_id) {
		List<SubFlight> flights = getFareRepository.getFlights(flight_id);
		int miles_earned = flights.get(0).getRoute_id().getMiles();
		return miles_earned;
	}

	private int calculateFare_withoutMiles(int flight_id, String seat_class_abbrev, int seats) {
		List<SubFlight> flights = getFareRepository.getFlights(flight_id);
		
		int seat_price = flights.get(0).getSeat_matrix().getPrice();
		int total_price = seat_price * seats;
		return total_price;
	}

	private int calculateFare_withMiles(int flight_id, String seat_class_abbrev, int seats, int user_air_miles) {
		
		int total_price_without_miles = calculateFare_withoutMiles(flight_id, seat_class_abbrev, seats);

		int miles_discount = (int)(user_air_miles * 0.5);
		int final_fare = total_price_without_miles - miles_discount;
		if(final_fare < 0){
			return 0;
		}else{
			return final_fare;
		}
	}

	@Override
	@Transactional(rollbackOn=Exception.class)
	public void bookFlight(@Valid PaymentForm payment) {
		startBookingFlight(payment);
	}

	private void startBookingFlight(@Valid PaymentForm payment) {
		System.out.println("user_id" + payment.getUser_id());
		if(checkAvailability(payment.getFlight_id(), payment.getSeat_type(),payment.getSeats())){
			reduceSeatCountOfFlight(payment.getFlight_id(), payment.getSeat_type(),payment.getSeats());
			saveEntryToUserBookingTable(payment);
			//int booking_id = getUserBookingId();
			int miles_used = 0;
			if (payment.getChoice() == 1) 
				miles_used = payment.getMiles_used();
			changeMilesFromUsersAccount(miles_used, payment.getMiles_earned(), payment.getUser_id());
			System.out.println("user_id" + payment.getUser_id());
//			if (booking_id == -1) {
//				//do nothing
//			}
		} else {
			System.out.println("booking failed");
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
	}


	private void changeMilesFromUsersAccount(int miles_used, int miles_earned, String user_id) {
		signUpRepository.changeMiles(miles_used , miles_earned, user_id);
		System.out.println("miles changed");
	}

	@Override
	public int getUserBookingId() {
		System.out.println("working till here");
		List<UserPaymentDetails> list = makePaymentRepository.getId();
		System.out.println("booking id");
		return list.get(0).getBooking_id();
	}

	private void saveEntryToUserBookingTable(@Valid PaymentForm payment) {
		UserPaymentDetails userPaymentDetails = new UserPaymentDetails();
		userPaymentDetails.setCc_cvv(payment.getCc_cvv());
		userPaymentDetails.setCc_expiry(payment.getCc_expiry());
		userPaymentDetails.setCc_name(payment.getCc_name());
		userPaymentDetails.setCc_number(payment.getCc_number());
		userPaymentDetails.setFlight_class(payment.getSeat_type());
		userPaymentDetails.setBooked_on();
		userPaymentDetails.setBooking_status("Scheduled");
		SubFlight s = enteringSubFlightRepository.findOne(payment.getFlight_id());
		userPaymentDetails.setFlight_id(s);
		userPaymentDetails.setSeats(payment.getSeats());
		if (payment.getChoice() == 1) {
			userPaymentDetails.setTotal_amount(payment.getFare_with_miles());
			userPaymentDetails.setMiles_used(payment.getMiles_used());
		} else {
			userPaymentDetails.setTotal_amount(payment.getFare_without_miles());
			userPaymentDetails.setMiles_used(0);
		}
		User u = signUpRepository.findByEmail(payment.getUser_id());
		userPaymentDetails.setUser_id(u);
		makePaymentRepository.save(userPaymentDetails);
		System.out.println("saved to booking");
	}

	private void reduceSeatCountOfFlight(int flight_id, String seat_type, int seats) {
//		int new_vacancy = vacancy - seats;
		enteringSubFlightRepository.updateSeats(flight_id, seat_type, seats);
		System.out.println("reduced seat count of flight");
	}
	
//	private int vacancy = 0;
	
	private boolean checkAvailability(int flight_id, String seat_type, int seats) {
		boolean op = false;
//		List<SubFlight> list = enteringSubFlightRepository.checkFlightAvailabilityRepository(flight_id, seat_type, seats);
		System.out.println(flight_id + " - " + seat_type + " - " + seats);
		int flight_availability = enteringSubFlightRepository.checkFlightAvailabilityRepository(flight_id, seat_type, seats);
		System.out.println("avail: " + flight_availability);
		if(flight_availability == 1){
			op = true;
//			vacancy = list.get(0).getSeat_matrix().getVacant();
		}else{
			op = false;
		}
		System.out.println("availibilty: " + op);
		return op;
	}
}
