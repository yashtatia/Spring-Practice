package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flt_seat_type" )
public class SeatType {

	@Id
	private String seat_type;
}
