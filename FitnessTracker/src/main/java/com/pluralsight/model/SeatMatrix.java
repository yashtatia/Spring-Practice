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
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "flt_seat_matrix")
public class SeatMatrix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seat_matrix_id;

	@OneToMany(mappedBy = "seat_matrix", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SubFlight> flight = new ArrayList<SubFlight>();

	@ManyToOne
	@NotNull
	@JoinColumn(name = "seat_type")
	private SeatType seat_type;

	@Positive
	private int seats;

	@PositiveOrZero
	private int vacant;

	@PositiveOrZero
	private int price;

	public List<SubFlight> getFlight() {
		return flight;
	}

	public int getPrice() {
		return price;
	}

	public Integer getSeat_matrix_id() {
		return seat_matrix_id;
	}

	public SeatType getSeat_type() {
		return seat_type;
	}

	public int getSeats() {
		return seats;
	}

	public int getVacant() {
		return vacant;
	}

	public void setFlight(List<SubFlight> flight) {
		this.flight = flight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSeat_matrix_id(Integer seat_matrix_id) {
		this.seat_matrix_id = seat_matrix_id;
	}

	public void setSeat_type(SeatType seat_type) {
		this.seat_type = seat_type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setVacant(int vacant) {
		this.vacant = vacant;
	}

}
