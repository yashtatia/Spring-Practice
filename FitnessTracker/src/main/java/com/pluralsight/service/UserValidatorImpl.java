package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.pluralsight.model.User;

@Service("userValidator")
public class UserValidatorImpl implements UserValidator {
	
	@Autowired
	private SignUpService signUpService;
	
	@Override
	public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.required");
        
        if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
            errors.rejectValue("email", "email.invalid");
        }
        if (signUpService.findByUsername(user.getEmail()) != null) {
            errors.rejectValue("email", "email.duplicate");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
        if (user.getPassword().length() < 0 ) {
            errors.rejectValue("password", "password.invalid");
        }
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname", "fname.required");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "lname.required");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "billing_address", "billing_address.required");

//        if (!user.getPasswordConfirm().equals(user.getPassword())) {
//            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
//        }
    }

}