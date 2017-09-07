package com.pluralsight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.LogInDetails;
import com.pluralsight.model.MyBookingsReport;
import com.pluralsight.service.MyBookingsService;

@Controller
@SessionAttributes("logInForm")
public class MyBookingsController {
	
	@Autowired
	private MyBookingsService myBookingsService;

	@RequestMapping(value="myBookings", method=RequestMethod.GET)
	public String getBookings(@ModelAttribute("logInForm") LogInDetails logInForm, Model model) {
		if(logInForm == null || logInForm.isLoggedIn() == false) {
			System.out.println("Not logged in");
			return "redirect:signUp.html";
		}
		List<MyBookingsReport> bookingslist = myBookingsService.findAllBookings(logInForm.getUsername());
		
		model.addAttribute("myBookingsReport", bookingslist);
		
		return "myBookings";
	}
	
	@RequestMapping(value="cancelBooking", method=RequestMethod.GET)
	public String cancelBookings(@RequestParam("bookingId") int bookingId,  @ModelAttribute("logInForm") LogInDetails logInForm, Model model) {
		myBookingsService.cancelBooking(bookingId);
		List<MyBookingsReport> bookingslist = myBookingsService.findAllBookings(logInForm.getUsername());
		
		model.addAttribute("myBookingsReport", bookingslist);
		
		return "myBookings";
	}
	
	@RequestMapping(value="manageTicket", method=RequestMethod.GET)
	public String manageTicket(@RequestParam("bookingId") int bookingId) {		
		return "manageTicket";
	}
	
	@ModelAttribute("logInForm")
	public LogInDetails getLogin() {
		System.out.println("loginform invoked makePayment");
		return new LogInDetails();
	}
}
