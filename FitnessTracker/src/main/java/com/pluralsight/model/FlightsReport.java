package com.pluralsight.model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightsReport {

	private Airport departure;
	private Airport arrival;
	private int miles;
	private String flight_date;
	private Time departure_time;
	private Time arrival_time;
	private Time duration;
	private String departure_time1;
	private String arrival_time1;
	private String duration1;
	private int vacancy;
	private int price;
	private SeatType seat_type;
	private int seats;

	private int flight_id;

	private int route_id;

	private Fleet fleet;

	private Carrier carrier;

	public FlightsReport() {

	}

	public FlightsReport(Airport departure, Airport arrival, int miles, Date flight_date, Date departure_time,
			Date arrival_time, int vacancy, int price, SeatType seat_type, int flight_id, int route_id, Fleet fleet,
			Carrier carrier) {
		this.departure = departure;
		this.arrival = arrival;
		this.miles = miles;
		String pattern = "d MMM yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		String date1 = formatter.format(flight_date);
		this.flight_date = date1;
		String pattern1 = "HH:mm";
		SimpleDateFormat formatter2 = new SimpleDateFormat(pattern1);
		this.departure_time1 = formatter2.format(departure_time);
		this.arrival_time1 = formatter2.format(arrival_time);
		this.departure_time = new Time(departure_time.getTime());
		this.arrival_time = new Time(arrival_time.getTime());
		setDuration();
		this.vacancy = vacancy;
		this.price = price;
		this.seat_type = seat_type;
		this.flight_id = flight_id;
		this.route_id = route_id;
		this.fleet = fleet;
		this.carrier = carrier;
	}

	public Airport getArrival() {
		return arrival;
	}

	public Time getArrival_time() {
		return arrival_time;
	}

	public String getArrival_time1() {
		return arrival_time1;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public Airport getDeparture() {
		return departure;
	}

	public Time getDeparture_time() {
		return departure_time;
	}

	public String getDeparture_time1() {
		return departure_time1;
	}

	public Time getDuration() {
		return duration;
	}

	public String getDuration1() {
		long millis = getDuration().getTime();
		long minute = (millis / (1000 * 60)) % 60;
		long hour = (millis / (1000 * 60 * 60)) % 24;
		duration1 = hour + " h " + minute + " m "; 
		return duration1;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public int getMiles() {
		return miles;
	}

	public int getPrice() {
		return price;
	}

	public int getRoute_id() {
		return route_id;
	}

	public SeatType getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setArrival(Airport arrival) {
		this.arrival = arrival;
	}

	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public void setDeparture(Airport departure) {
		this.departure = departure;
	}

	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}

	public void setDuration() {
		long diff = arrival_time.getTime() - departure_time.getTime();
		this.duration = new Time(diff);
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public void setSeat_type(SeatType seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

}
