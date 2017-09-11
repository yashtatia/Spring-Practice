package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "flt_route")
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer route_id;

	@OneToMany(mappedBy = "route_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SubFlight> flights = new ArrayList<SubFlight>();
	
	@OneToMany(mappedBy = "route_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Flight> flight = new ArrayList<Flight>();

	@ManyToOne
	@NotNull
	@JoinColumn(name = "source_id")
	private Airport source_id;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "destination_id")
	private Airport destination_id;

	@Positive
	private int miles;

	public Airport getDestination_id() {
		return destination_id;
	}

	public List<SubFlight> getFlights() {
		return flights;
	}

	public int getMiles() {
		return miles;
	}

	public Integer getRoute_id() {
		return route_id;
	}

	public Airport getSource_id() {
		return source_id;
	}

	public void setDestination_id(Airport destination_id) {
		this.destination_id = destination_id;
	}

	public void setFlights(List<SubFlight> flights) {
		this.flights = flights;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public void setRoute_id(Integer route_id) {
		this.route_id = route_id;
	}

	public void setSource_id(Airport source_id) {
		this.source_id = source_id;
	}

}