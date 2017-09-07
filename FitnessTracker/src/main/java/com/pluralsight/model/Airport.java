package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flt_airport")
public class Airport {

	@Id
	private String airport_id;

	@NotNull
	private String airport_name;

	@OneToMany(mappedBy = "source_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Route> route1 = new ArrayList<Route>();

	@OneToMany(mappedBy = "destination_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Route> route2 = new ArrayList<Route>();

	public String getAirport_id() {
		return airport_id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public List<Route> getRoute1() {
		return route1;
	}

	public List<Route> getRoute2() {
		return route2;
	}

	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public void setRoute1(List<Route> route1) {
		this.route1 = route1;
	}

	public void setRoute2(List<Route> route2) {
		this.route2 = route2;
	}

}
