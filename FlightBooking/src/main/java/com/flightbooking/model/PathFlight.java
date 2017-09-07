package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "flt_path_flight")
public class PathFlight {

	@Id
	@GeneratedValue
	private Integer path_flight_id;

	private int path_id;

	private int flight_id;
	
	@Positive
	private int order;

	public int getFlight_id() {
		return flight_id;
	}

	public int getOrder() {
		return order;
	}

	public Integer getPath_flight_id() {
		return path_flight_id;
	}

	public int getPath_id() {
		return path_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public void setPath_flight_id(Integer path_flight_id) {
		this.path_flight_id = path_flight_id;
	}

	public void setPath_id(int path_id) {
		this.path_id = path_id;
	}
}
