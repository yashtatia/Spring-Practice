package com.fightbooking.service;

import javax.validation.Valid;

import com.flightbooking.model.User;

public interface SignUpService {

	User save(@Valid User user);

	User findByUsername(String email);

	User validateUser(String username, String password);

}