package com.pluralsight.service;

import javax.validation.Valid;

import org.springframework.validation.Errors;

import com.pluralsight.model.LogInDetails;

public interface UserValidator {

	void validateSignUp(Object o, Errors errors);

	void validateLogin(@Valid LogInDetails logInDetails, Errors errors);

}