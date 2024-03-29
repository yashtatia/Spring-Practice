package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

@Entity
@Table(name="flt_route")
public class Route {

	@Id
	private Integer route_id;
	
	private String source_id;
	
	private String destination_id;
	
	@Positive
	private int miles;

	public String getDestination_id() {
		return destination_id;
	}

	public int getMiles() {
		return miles;
	}

	public Integer getRoute_id() {
		return route_id;
	}

	public String getSource_id() {
		return source_id;
	}

	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public void setRoute_id(Integer route_id) {
		this.route_id = route_id;
	}

	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}
}
