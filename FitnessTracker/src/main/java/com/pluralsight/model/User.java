package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flt_users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer user_id;

	@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserPaymentDetails> paymnetDetails = new ArrayList<UserPaymentDetails>();

	@NotNull
	private String email;

	private String contact;

	@NotNull
	private String password;

	@NotNull
	private String fname;

	@NotNull
	private String lname;

	private int air_miles;

	@NotNull
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

	public List<UserPaymentDetails> getPaymnetDetails() {
		return paymnetDetails;
	}

	public Integer getUser_id() {
		return user_id;
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

	public void setPaymnetDetails(List<UserPaymentDetails> paymnetDetails) {
		this.paymnetDetails = paymnetDetails;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
