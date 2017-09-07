package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name="flt_seat_matrix")
public class SeatMatrix {

	@Id
	private Integer flight_id;
	
	private String seat_type;
	
	@Positive
	private int seats;
	
	@PositiveOrZero
	private int vacant;
	
	@PositiveOrZero
	private int price;

	public Integer getFlight_id() {
		return flight_id;
	}

	public int getPrice() {
		return price;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public int getVacant() {
		return vacant;
	}

	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setVacant(int vacant) {
		this.vacant = vacant;
	}
}
