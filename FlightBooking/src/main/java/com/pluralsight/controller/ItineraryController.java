package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.FlightSelected;
import com.pluralsight.model.Itinerary;
import com.pluralsight.model.LogInDetails;
import com.pluralsight.model.PaymentForm;
import com.pluralsight.model.User;
import com.pluralsight.service.SignUpService;

@Controller
@SessionAttributes({"payment", "logInForm", "flightSelected", "userForm"})
public class ItineraryController {
	
	@Autowired
	private SignUpService signUpService;
	
	@RequestMapping(value="itinerary", method=RequestMethod.GET)
	public String displayItinerary(@ModelAttribute("logInForm") LogInDetails logInForm, @ModelAttribute("payment") PaymentForm payment, @ModelAttribute("userForm") User userForm, @ModelAttribute("flightSelected") FlightSelected flightSelected, Model model ) {
		
		System.out.println("Itinerary - get");
		if(logInForm == null || logInForm.isLoggedIn() == false) {
			System.out.println("Not logged in");
			return "redirect:signUp.html";
		}
		if(payment == null || payment.isPayment() == false ) {
			System.out.println("No flight selected");
			return "redirect:index.jsp";
		}
		User user = signUpService.findByUsername(userForm.getEmail());
		int new_miles = user.getAir_miles();
		System.out.println("update air miles" + new_miles);
		userForm.setAir_miles(new_miles);
		//check if user already logged in
		System.out.println(logInForm.isLoggedIn());
		if(logInForm == null || logInForm.isLoggedIn() == false) {
			System.out.println("Not logged in");
			return "redirect:signUp.html";
		}
		System.out.println(flightSelected.getAirline());
		Itinerary itinerary = new Itinerary();
//		itinerary.setCarrier_id(carrier_id);
		itinerary.setCarrier_name(flightSelected.getAirline());
		itinerary.setDestination_id(flightSelected.getArrival_id());
		itinerary.setDestination_name(flightSelected.getArrival());
		itinerary.setArrival_time(flightSelected.getDeparture_time());
		itinerary.setFname(userForm.getFname());
		itinerary.setLname(userForm.getLname());
		itinerary.setSeat_numbers("Will be provided during boarding");
		itinerary.setSeat_type(flightSelected.getSeat_class());
		itinerary.setSeats(flightSelected.getSeats());
		itinerary.setBooking_id("PNR");
		itinerary.setSource_id(flightSelected.getDeparture_id());
		itinerary.setSource_name(flightSelected.getDeparture());
		itinerary.setDeparture_time(flightSelected.getDeparture_time());
		itinerary.setDuration(flightSelected.getDuration());
		itinerary.setFlight_date(flightSelected.getFlight_date());
		float total_fare = 0;
		if (payment.getChoice() == 1) {
			total_fare = payment.getFare_with_miles();
		} else {
			total_fare = payment.getFare_without_miles();
		}
		itinerary.setTotal_fare(total_fare);
		
		model.addAttribute("itinerary", itinerary);
		
		
		return "itinerary";
	}
	
	@ModelAttribute("logInForm")
	public LogInDetails getLogin() {
		System.out.println("loginform invoked makePayment");
		return new LogInDetails();
	}
	
	@ModelAttribute("payment")
	public PaymentForm getPayment() {
		System.out.println("paymentform invoked makePayment");
		return new PaymentForm();
	}
	
	@ModelAttribute("userForm")
	public User getUser() {
		System.out.println("userform invoked makePayment");
		return new User();
	}
	
	@ModelAttribute("flightSelected")
	public FlightSelected getFlightSelected() {
		System.out.println("flightselected invoked makePayment");
		return new FlightSelected();
	}

}