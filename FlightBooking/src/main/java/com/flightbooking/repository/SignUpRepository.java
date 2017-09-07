package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightbooking.model.User;

@Repository("signUpRepository")
public interface SignUpRepository extends JpaRepository<User, Integer> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

	User findByEmail(String username);

	@Query("Select user from User user where email=?1 and password=?2")
	User findByUsernamePassword(String username, String password);	

}
