package com.pluralsight.model;

import java.sql.Date;
import java.sql.Time;
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

@Entity
@Table(name = "flt_sub_flight")
public class SubFlight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flight_id;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "fleet_id")
	private Fleet fleet_id;

	@OneToMany(mappedBy = "flight_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserPaymentDetails> paymentDetails = new ArrayList<UserPaymentDetails>();

	@OneToMany(mappedBy = "flight_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PathFlight> pathFlight = new ArrayList<PathFlight>();

	@ManyToOne
	@NotNull
	@JoinColumn(name = "seat_matrix_id")
	private SeatMatrix seat_matrix;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "route_id")
	private Route route_id;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "carrier_id")
	private Carrier carrier_id;

	private Date date;

	private Time departure_time;

	private Time arrival_time;

	public Time getArrival_time() {
		return arrival_time;
	}

	public Carrier getCarrier_id() {
		return carrier_id;
	}

	public Date getDate() {
		return date;
	}

	public Time getDeparture_time() {
		return departure_time;
	}

	public Fleet getFleet_id() {
		return fleet_id;
	}

	public Integer getFlight_id() {
		return flight_id;
	}

	public List<PathFlight> getPathFlight() {
		return pathFlight;
	}

	public List<UserPaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}

	public Route getRoute_id() {
		return route_id;
	}

	public SeatMatrix getSeat_matrix() {
		return seat_matrix;
	}

	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setCarrier_id(Carrier carrier_id) {
		this.carrier_id = carrier_id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}

	public void setFleet_id(Fleet fleet_id) {
		this.fleet_id = fleet_id;
	}

	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
	}

	public void setPathFlight(List<PathFlight> pathFlight) {
		this.pathFlight = pathFlight;
	}

	public void setPaymentDetails(List<UserPaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public void setRoute_id(Route route_id) {
		this.route_id = route_id;
	}

	public void setSeat_matrix(SeatMatrix seat_matrix) {
		this.seat_matrix = seat_matrix;
	}

}
