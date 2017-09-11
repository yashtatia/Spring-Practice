package com.pluralsight.model;

public class FlightSelected {

	private String departure;// source
	private String arrival;// destination
	private String seat_class;
	private String seat_class_abbrev;
	private String airline;
	private String departure_id;
	private String arrival_id;
	private int flight_id;

	private String departure_time;

	private String arrival_time;

	private String duration;

	private String flight_date;
	private int seats;
	private int route_id;
	private int user_air_miles;
	private int price;

	private boolean isFlightSelected;

	public String getAirline() {
		return airline;
	}

	public String getArrival() {
		return arrival;
	}

	public String getArrival_id() {
		return arrival_id;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public String getDeparture() {
		return departure;
	}

	public String getDeparture_id() {
		return departure_id;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public String getDuration() {
		return duration;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public int getPrice() {
		return price;
	}

	public int getRoute_id() {
		return route_id;
	}

	public String getSeat_class() {
		return seat_class;
	}

	public String getSeat_class_abbrev() {
		return seat_class_abbrev;
	}

	public int getSeats() {
		return seats;
	}

	public int getUser_air_miles() {
		return user_air_miles;
	}

	public boolean isFlightSelected() {
		return isFlightSelected;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public void setArrival_id(String arrival_id) {
		this.arrival_id = arrival_id;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setDeparture_id(String departure_id) {
		this.departure_id = departure_id;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public void setFlightSelected(boolean isFlightSelected) {
		this.isFlightSelected = isFlightSelected;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}

	public void setSeat_class_abbrev(String seat_class_abbrev) {
		this.seat_class_abbrev = seat_class_abbrev;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setUser_air_miles(int user_air_miles) {
		this.user_air_miles = user_air_miles;
	}

}