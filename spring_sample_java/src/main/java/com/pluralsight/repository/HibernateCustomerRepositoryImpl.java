package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("big");
		customer.setLastname("boss");
		
		customers.add(customer);
		
		return customers;
	}
}
