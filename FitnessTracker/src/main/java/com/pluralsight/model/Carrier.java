package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flt_carrier")
public class Carrier {
	
	@Id
	private String carrier_id;
	
	private String carrier_name;
	
	private String carrier_address;
	
	private String carrier_contact;
	
	

	public String getCarrier_address() {
		return carrier_address;
	}

	public String getCarrier_contact() {
		return carrier_contact;
	}

	public String getCarrier_id() {
		return carrier_id;
	}

	public String getCarrier_name() {
		return carrier_name;
	}

	public void setCarrier_address(String carrier_address) {
		this.carrier_address = carrier_address;
	}

	public void setCarrier_contact(String carrier_contact) {
		this.carrier_contact = carrier_contact;
	}

	public void setCarrier_id(String carrier_id) {
		this.carrier_id = carrier_id;
	}

	public void setCarrier_name(String carrier_name) {
		this.carrier_name = carrier_name;
	}
	
}
