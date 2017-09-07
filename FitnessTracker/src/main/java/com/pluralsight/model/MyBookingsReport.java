package com.pluralsight.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBookingsReport {

	private Airport source;
	private Airport destination;
	private Carrier carrier;
	private String seat_type;
	private int seats;
	private Float total_amount;
	private int booking_id;
	private int flight_id;
	private Date flight_date;
	private String booked_on;
	private String booking_status;
	// private String day;
	// private String month;
	// private String year;
	//
	// private String weekday;

	public MyBookingsReport(Airport source, Airport destination, Carrier carrier, String seat_type, int seats,
			Float total_amount, int booking_id, int flight_id, Date flight_date, Date date, String booking_status) {
		this.source = source;
		this.destination = destination;
		this.carrier = carrier;
		this.seat_type = seat_type;
		this.seats = seats;
		this.total_amount = total_amount;
		this.booking_id = booking_id;
		this.flight_id = flight_id;
		this.flight_date = flight_date;
		String pattern = "EEE, d MMM yyyy HH:mm";
	    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
	    String date1 = formatter.format(date);
	      this.booked_on = date1;
		
		this.booking_status = booking_status;
	}

	public String getBooked_on() {
		return booked_on;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public String getBooking_status() {
		return booking_status;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	@SuppressWarnings("deprecation")
	public int getDay() {
		return flight_date.getDate();
	}

	public Airport getDestination() {
		return destination;
	}

	public Date getFlight_date() {
		return flight_date;
	}

	public int getFlight_id() {
		return flight_id;
	}

	@SuppressWarnings("deprecation")
	public String getMonth() {
		int m = flight_date.getMonth();
		String month = "";
		switch (m) {
		case 0:
			month = "Jan";
			break;
		case 1:
			month = "Feb";
			break;
		case 2:
			month = "Mar";
			break;
		case 3:
			month = "Apr";
			break;
		case 4:
			month = "May";
			break;
		case 5:
			month = "Jun";
			break;
		case 6:
			month = "Jul";
			break;
		case 7:
			month = "Aug";
			break;
		case 8:
			month = "Sep";
			break;
		case 9:
			month = "Oct";
			break;
		case 10:
			month = "Nov";
			break;
		case 11:
			month = "Dec";
			break;

		}
		return month;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public Airport getSource() {
		return source;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	@SuppressWarnings("deprecation")
	public String getWeekday() {
		int w = flight_date.getDay();
		String weekday = "";
		switch (w) {
		case 0:
			weekday = "Sunday";
			break;
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wednesday";
			break;
		case 4:
			weekday = "Thursday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		}
		return weekday;
	}

	@SuppressWarnings("deprecation")
	public String getYear() {
		int y = flight_date.getYear() + 1900;
		String year = "" + y;
		return year;
	}

	public void setBooked_on(String booked_on) {
		this.booked_on = booked_on;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

}
