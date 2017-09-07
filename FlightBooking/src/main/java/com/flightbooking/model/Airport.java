package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flt_airport")
public class Airport {

	@Id
	private String airport_id;
	
	@NotNull
	private String airport_name;

	public String getAirport_id() {
		return airport_id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

}