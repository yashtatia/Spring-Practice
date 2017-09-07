package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flt_sub_flight")
public class SubFlight {

	@Id
	@GeneratedValue
	private Integer flight_id;

	private int fleet_id;

	private int route_id;

	private String carrier_id;

	private String date;

	private String time;

	public String getCarrier_id() {
		return carrier_id;
	}

	public String getDate() {
		return date;
	}

	public int getFleet_id() {
		return fleet_id;
	}

	public Integer getFlight_id() {
		return flight_id;
	}

	public int getRoute_id() {
		return route_id;
	}

	public String getTime() {
		return time;
	}

	public void setCarrier_id(String carrier_id) {
		this.carrier_id = carrier_id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setFleet_id(int fleet_id) {
		this.fleet_id = fleet_id;
	}

	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
