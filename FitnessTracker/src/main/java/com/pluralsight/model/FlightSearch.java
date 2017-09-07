package com.pluralsight.model;

import java.sql.Date;

public class FlightSearch {

	private String source_airport;
	
	private String destination_airport;
	
	private Date flight_date;
	
	private String seat_class;
	
	private int seats;

	public String getDestination_airport() {
		return destination_airport;
	}

	public Date getFlight_date() {
		return flight_date;
	}

	public String getSeat_class() {
		return seat_class;
	}

	public int getSeats() {
		return seats;
	}

	public String getSource_airport() {
		return source_airport;
	}

	public void setDestination_airport(String destination_airport) {
		this.destination_airport = destination_airport;
	}

	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}

	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setSource_airport(String source_airport) {
		this.source_airport = source_airport;
	}
}
