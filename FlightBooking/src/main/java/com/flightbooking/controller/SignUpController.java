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

import com.fightbooking.service.SignUpService;
import com.fightbooking.service.UserValidator;
import com.flightbooking.model.LogInDetails;
import com.flightbooking.model.User;

@Controller
@SessionAttributes({"userForm", "logInForm"})
public class SignUpController {
	
	@Autowired
	private SignUpService signUpService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	@RequestMapping(value="signUp", method=RequestMethod.GET)
	public String getUser(Model model, HttpSession session) {
		
		User user = (User)session.getAttribute("userForm");
		if(user == null) {
			user = new User();
			user.setEmail("q@q.com");
			user.setFname("t");
			user.setLname("l");
			user.setPassword("p");
			user.setBilling_address("s");
		}
		
		model.addAttribute("userForm", user);
		
		return "signUp";
	}
	
	@RequestMapping(value="signUp", method=RequestMethod.POST)
	public String createUser(@Valid @ModelAttribute("userForm") User user, BindingResult result) {
		
		userValidator.validate(user, result);
		
		System.out.println("Result has errors: " + result.hasErrors());
		System.out.println("Email updated: " + user.getEmail());
		
		if (result.hasErrors()) {
			return "signUp";
		}
		
		signUpService.save(user);
		
		
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="logIn", method=RequestMethod.POST)
	public String verfiyUser(@Valid @ModelAttribute("logInForm") LogInDetails logInDetails, BindingResult result) {
		
		boolean isLoggedIn = false;
		System.out.println("Result has errors: " + result.hasErrors());
		System.out.println("Email updated: " + logInDetails.getUsername());
		
		if (result.hasErrors()) {
			return "signUp";
		} else {
			isLoggedIn = signUpService.validateUser(logInDetails.getUsername(), logInDetails.getPassword()) != null;
			if (!isLoggedIn) {
				return "signUp";
			}
			System.out.println("Present user");
		}
		
		return "redirect:index.jsp";
	}
}