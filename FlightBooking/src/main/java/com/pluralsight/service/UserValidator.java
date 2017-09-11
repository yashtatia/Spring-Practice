package com.pluralsight.service;

import org.springframework.validation.Errors;

public interface UserValidator {

	void validate(Object o, Errors errors);

}