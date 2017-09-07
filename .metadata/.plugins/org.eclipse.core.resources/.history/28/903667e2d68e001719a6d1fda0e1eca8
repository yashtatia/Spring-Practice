package com.fightbooking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.model.User;
import com.flightbooking.repository.SignUpRepository;

@Service("signUpService")
public class SignUpServiceImpl implements SignUpService {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	
	@Transactional
	public User save(User user) {
		return signUpRepository.save(user);
	}


	@Override
	public User findByUsername(String username) {
		return signUpRepository.findByEmail(username);
	}


	@Override
	public User validateUser(String username, String password) {
		return signUpRepository.findByUsernamePassword(username, password);
	}
	
	

}
