package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flt_path_flight")
public class PathFlight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer journey_id;

	private int path_id;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "flight_id")
	private SubFlight flight_id;

	@NotNull
	private int flight_order;

	public SubFlight getFlight_id() {
		return flight_id;
	}

	public int getFlight_order() {
		return flight_order;
	}

	public Integer getJourney_id() {
		return journey_id;
	}

	public int getPath_id() {
		return path_id;
	}

	public void setFlight_id(SubFlight flight_id) {
		this.flight_id = flight_id;
	}

	public void setFlight_order(int flight_order) {
		this.flight_order = flight_order;
	}

	public void setJourney_id(Integer journey_id) {
		this.journey_id = journey_id;
	}

	public void setPath_id(int path_id) {
		this.path_id = path_id;
	}

}
