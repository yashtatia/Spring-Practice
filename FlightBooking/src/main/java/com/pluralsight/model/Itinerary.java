package com.pluralsight.model;

public class Itinerary {

	private String source_id;
	private String source_name;
	private String destination_id;
	private String destination_name;
	private String departure_time;
	private String arrival_time;
	private String duration;
	private String flight_date;

	private String fname;

	private String lname;

	private String booking_id;// later to pnr no

	private String carrier_id;

	private String carrier_name;

	private String seat_type;

	private int seats;

	private String seat_numbers;

	private float total_fare;
	public String getArrival_time() {
		return arrival_time;
	}

	public String getBooking_id() {
		return booking_id;
	}

	public String getCarrier_id() {
		return carrier_id;
	}
	public String getCarrier_name() {
		return carrier_name;
	}

	public String getDeparture_time() {
		return departure_time;
	}
	public String getDestination_id() {
		return destination_id;
	}
	public String getDestination_name() {
		return destination_name;
	}

	public String getDuration() {
		return duration;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getSeat_numbers() {
		return seat_numbers;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public String getSource_id() {
		return source_id;
	}

	public String getSource_name() {
		return source_name;
	}

	public float getTotal_fare() {
		return total_fare;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}

	public void setCarrier_id(String carrier_id) {
		this.carrier_id = carrier_id;
	}

	public void setCarrier_name(String carrier_name) {
		this.carrier_name = carrier_name;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}

	public void setDestination_name(String destination_name) {
		this.destination_name = destination_name;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setSeat_numbers(String seat_numbers) {
		this.seat_numbers = seat_numbers;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public void setTotal_fare(float total_fare) {
		this.total_fare = total_fare;
	}

}