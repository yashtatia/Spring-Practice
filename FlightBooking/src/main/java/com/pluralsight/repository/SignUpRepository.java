package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.User;

@Repository("signUpRepository")
public interface SignUpRepository extends JpaRepository<User, Integer> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

	User findByEmail(String username);

	@Modifying
	@Query("Update User user set user.air_miles = user.air_miles - ?1 + ?2 where user.email=?3 ")
	void changeMiles(int miles_used, int miles_earned, String user_email);	

}
