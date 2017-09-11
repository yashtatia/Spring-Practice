package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flt_seat_type")
public class SeatType {

	@Id
	private String seat_type;

	private String description;

	public String getDescription() {
		return description;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}
}
