package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="flt_users")
public class User {
	
	@Id
	@GeneratedValue
	private Integer user_id;

	@NotEmpty
	private String email;
	
	private String contact;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String fname;
	
	@NotEmpty
	private String lname;
	
	private int air_miles;
	
	@NotEmpty
	private String billing_address;

	public int getAir_miles() {
		return air_miles;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public String getContact() {
		return contact;
	}

	public String getEmail() {
		return email;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getPassword() {
		return password;
	}

	public void setAir_miles(int air_miles) {
		this.air_miles = air_miles;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
