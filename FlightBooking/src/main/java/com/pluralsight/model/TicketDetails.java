package com.pluralsight.model;

import java.text.SimpleDateFormat;
import java.util.List;

public class TicketDetails {

	private String carrier_info;
	private int booking_id;
	private String departure_time;
	private String departure_id;
	private String departure_name;
	private String departure_date;
	private String departure_gate;
	private String departure_terminal;
	private String duration;
	private String arrival_time;
	private String arrival_id;
	private String arrival_name;
	private String arrival_date;
	private String arrival_gate;
	private String arrival_terminal;
	private List<String> passengers;
	private List<String> type;
	private float total_cost;
	private String payment_method;
	private String card_number;

	

	public TicketDetails(UserPaymentDetails user) {
		this.carrier_info = user.getFlight_id().getCarrier_id().getCarrier_name() + " " + user.getFlight_id().getFleet_id().getModel();
		this.booking_id = user.getBooking_id();
		
		String pattern = "HH:mm a";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		this.departure_time = formatter.format(user.getFlight_id().getDeparture_time());
		
		this.departure_id = user.getFlight_id().getRoute_id().getSource_id().getAirport_id();
		this.departure_name = user.getFlight_id().getRoute_id().getSource_id().getAirport_name();
		
		pattern = "d MMM yyyy";
		SimpleDateFormat formatter1 = new SimpleDateFormat(pattern);
		this.departure_date = formatter1.format(user.getFlight_id().getDate());
		
		long millis = user.getFlight_id().getArrival_time().getTime() - user.getFlight_id().getDeparture_time().getTime();
		long minute = (millis / (1000 * 60)) % 60;
		long hour = (millis / (1000 * 60 * 60)) % 24;
		this.duration = hour + " h " + minute + " m ";
		
		this.arrival_time = formatter.format(user.getFlight_id().getArrival_time());
		this.arrival_id = user.getFlight_id().getRoute_id().getDestination_id().getAirport_id();
		this.arrival_name = user.getFlight_id().getRoute_id().getDestination_id().getAirport_name();
		this.arrival_date = formatter1.format(user.getFlight_id().getDate());
		
		this.total_cost = user.getTotal_amount();
		String s = user.getCc_number();
		if(user.getMiles_used() == 0) {
			this.payment_method = "CC Payment";
			//this.card_number = s.substring(0, 2) + "XX-XXXX-XX" + s.substring(11);
		} else {
			this.payment_method = total_cost == 0? "Miles used":"Miles + CC Payment"; 
			//this.card_number = total_cost == 0? "NA": s.substring(0, 2) + "XX-XXXX-XX" + s.substring(11);
		}
	}

	public String getArrival_date() {
		return arrival_date;
	}

	public String getArrival_gate() {
		return arrival_gate;
	}

	public String getArrival_id() {
		return arrival_id;
	}

	public String getArrival_name() {
		return arrival_name;
	}

	public String getArrival_terminal() {
		return arrival_terminal;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public String getCard_number() {
		return card_number;
	}

	public String getCarrier_info() {
		return carrier_info;
	}

	public String getDeparture_date() {
		return departure_date;
	}

	public String getDeparture_gate() {
		return departure_gate;
	}

	public String getDeparture_id() {
		return departure_id;
	}

	public String getDeparture_name() {
		return departure_name;
	}

	public String getDeparture_terminal() {
		return departure_terminal;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public String getDuration() {
		return duration;
	}

	public List<String> getPassengers() {
		return passengers;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public float getTotal_cost() {
		return total_cost;
	}

	public List<String> getType() {
		return type;
	}

	public void setArrival_gate(String arrival_gate) {
		this.arrival_gate = arrival_gate;
	}

	public void setArrival_terminal(String arrival_terminal) {
		this.arrival_terminal = arrival_terminal;
	}

	public void setDeparture_gate(String departure_gate) {
		this.departure_gate = departure_gate;
	}

	public void setDeparture_terminal(String departure_terminal) {
		this.departure_terminal = departure_terminal;
	}

}
