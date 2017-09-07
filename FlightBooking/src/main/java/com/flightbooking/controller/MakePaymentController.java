package com.flightbooking.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fightbooking.service.MakePaymentService;
import com.flightbooking.model.UserPaymentDetails;

@Controller
@SessionAttributes("payment")
public class MakePaymentController {
	
//	@Autowired
//	private MakePaymentService makePaymentService;

	@RequestMapping(value="makePayment", method=RequestMethod.GET)
	public String addPaymentDetails(Model model, HttpSession session) {
		UserPaymentDetails payment = (UserPaymentDetails)session.getAttribute("payment");
		if (payment == null) {
			payment = new UserPaymentDetails();
			payment.setUser_id(1);
			payment.setFlight_id(1);
			payment.setFlight_class("eco");
			payment.setSeats(2);
		}
		model.addAttribute("payment", payment);
		
		return "makePayment";
	}
	
	@RequestMapping(value="makePayment", method=RequestMethod.POST)
	public String updatePaymentDetails(@Valid @ModelAttribute("payment") UserPaymentDetails payment, BindingResult result) {
		
		System.out.println("Result has errors: " + result.hasErrors());
		System.out.println("Flight_id updated: " + payment.getFlight_id());
		
		if (result.hasErrors()) {
			return "makePayment";
		} else {
//			makePaymentService.save(payment);
		}
		
		return "redirect:index.jsp";
	}
}
