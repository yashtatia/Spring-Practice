package com.pluralsight.model;

public class PaymentForm {

	private int booking_id;
	private String user_id;// user email which is also unique
	private int flight_id;
	private String seat_type;
	private int seats;
	private int payment_choice;
	private int miles_used;

	private String cc_name;

	private String cc_number;

	private String cc_expiry;

	private String cc_cvv;

	private float fare_with_miles;
	private float fare_without_miles;
	private int miles_remaining;
	private int miles_earned;

	private boolean isPayment;

	public int getBooking_id() {
		return booking_id;
	}

	public String getCc_cvv() {
		return cc_cvv;
	}

	public String getCc_expiry() {
		return cc_expiry;
	}

	public String getCc_name() {
		return cc_name;
	}

	public String getCc_number() {
		return cc_number;
	}

	public int getChoice() {
		return payment_choice;
	}

	public float getFare_with_miles() {
		return fare_with_miles;
	}

	public float getFare_without_miles() {
		return fare_without_miles;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public int getMiles_earned() {
		return miles_earned;
	}

	public int getMiles_remaining() {
		return miles_remaining;
	}

	public int getMiles_used() {
		return miles_used;
	}

	public int getPayment_choice() {
		return payment_choice;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public String getUser_id() {
		return user_id;
	}

	public boolean isPayment() {
		return isPayment;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public void setCc_cvv(String cc_cvv) {
		this.cc_cvv = cc_cvv;
	}

	public void setCc_expiry(String cc_expiry) {
		this.cc_expiry = cc_expiry;
	}

	public void setCc_name(String cc_name) {
		this.cc_name = cc_name;
	}

	public void setCc_number(String cc_number) {
		this.cc_number = cc_number;
	}

	public void setChoice(int choice) {
		this.payment_choice = choice;
	}

	public void setFare_with_miles(float fare_with_miles) {
		this.fare_with_miles = fare_with_miles;
	}

	public void setFare_without_miles(float fare_without_miles) {
		this.fare_without_miles = fare_without_miles;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public void setMiles_earned(int miles_earned) {
		this.miles_earned = miles_earned;
	}

	public void setMiles_remaining(int miles_remaining) {
		this.miles_remaining = miles_remaining;
	}

	public void setMiles_used(int miles_used) {
		this.miles_used = miles_used;
	}

	public void setPayment(boolean isPayment) {
		this.isPayment = isPayment;
	}

	public void setPayment_choice(int payment_choice) {
		this.payment_choice = payment_choice;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
