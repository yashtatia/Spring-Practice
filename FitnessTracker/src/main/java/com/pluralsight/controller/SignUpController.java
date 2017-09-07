package com.pluralsight.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.pluralsight.model.LogInDetails;
import com.pluralsight.model.User;
import com.pluralsight.service.SignUpService;
import com.pluralsight.service.UserValidator;

@Controller
@SessionAttributes({"userForm", "logInForm"})
public class SignUpController {
	
	@Autowired
	private SignUpService signUpService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	@RequestMapping(value="signUp", method=RequestMethod.GET)
	public String setUpUserForm() {
		
		System.out.println("signup - get");

		return "signUp";
	}
	
	@ModelAttribute("userForm")
	public User getUser() {
		System.out.println("userform invoked");
		return new User();
	}
	
	@ModelAttribute("logInForm")
	public LogInDetails getLogin() {
		System.out.println("loginform invoked");
		return new LogInDetails();
	}
	
	@RequestMapping(value="signUp", method=RequestMethod.POST)
	public String createUser(@Valid @ModelAttribute("userForm") User user, BindingResult result, HttpSession session) {
		System.out.println("signup - post");
		userValidator.validate(user, result);
		
		System.out.println("Result has errors: " + result.hasErrors());
		
		if (result.hasErrors()) {
			return "signUp";
		}
		user.setAir_miles(500); // New user bonus
		signUpService.save(user);
		//Auto login
		LogInDetails logInForm = (LogInDetails)session.getAttribute("logInForm");
		logInForm.setUsername(user.getEmail());
		logInForm.setPassword(user.getPassword());
		logInForm.setLoggedIn(true);
		System.out.println("User created: " + user.getEmail());
		
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="logIn",  method=RequestMethod.POST)
	public String verfiyUser(@Valid @ModelAttribute("logInForm") LogInDetails logInDetails, @ModelAttribute("userForm") User userForm, BindingResult result) {
		System.out.println("login - post");
		boolean isLoggedIn = false;
		User user;
		System.out.println("Result has errors: " + result.hasErrors());
		System.out.println("Email updated: " + logInDetails.getUsername());
		
		if (result.hasErrors()) {
			return "signUp";
		} else {
			user = signUpService.validateUser(logInDetails.getUsername(), logInDetails.getPassword());
			isLoggedIn = user != null;
			if (!isLoggedIn) {
				return "signUp";
			}
			System.out.println("user air miles" + user.getAir_miles());
			userForm.setAir_miles(user.getAir_miles());
			userForm.setFname(user.getFname());
			userForm.setLname(user.getLname());
			userForm.setContact(user.getContact());
			userForm.setEmail(user.getEmail());
			System.out.println("successful user");
			isLoggedIn = true;
			logInDetails.setLoggedIn(isLoggedIn);
			
		}
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="logout",  method=RequestMethod.GET)
	public String logoutUser(@Valid @ModelAttribute("logInForm") LogInDetails logInForm, SessionStatus session) {
		System.out.println("logout - get");
		System.out.println( logInForm.isLoggedIn());
		session.setComplete();
		System.out.println( logInForm.isLoggedIn());
		return "redirect:index.jsp";
	}
}