package com.flightbooking.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flt_flight")
public class Flight {

	@Id
	@GeneratedValue
	private Integer flight_id;

	private String carrier_id;

	private String flight_type;

	private int route_id;

	private int vacancy_eco;

	private int vacancy_bus;

	private int vacancy_elt;

	private int price_eco;

	private int price_bus;

	private int price_elt;

	public String getCarrier_id() {
		return carrier_id;
	}

	public void setCarrier_id(String carrier_id) {
		this.carrier_id = carrier_id;
	}

	public String getFlight_type() {
		return flight_type;
	}

	public void setFlight_type(String flight_type) {
		this.flight_type = flight_type;
	}

	private Date flight_date;

	private Time flight_time;

	public Date getFlight_date() {
		return flight_date;
	}

	public Integer getFlight_id() {
		return flight_id;
	}

	public Time getFlight_time() {
		return flight_time;
	}

	public int getPrice_bus() {
		return price_bus;
	}

	public int getPrice_eco() {
		return price_eco;
	}

	public int getPrice_elt() {
		return price_elt;
	}

	public int getRoute_id() {
		return route_id;
	}

	public int getVacancy_bus() {
		return vacancy_bus;
	}

	public int getVacancy_eco() {
		return vacancy_eco;
	}

	public int getVacancy_elt() {
		return vacancy_elt;
	}

	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}

	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
	}

	public void setFlight_time(Time flight_time) {
		this.flight_time = flight_time;
	}

	public void setPrice_bus(int price_bus) {
		this.price_bus = price_bus;
	}

	public void setPrice_eco(int price_eco) {
		this.price_eco = price_eco;
	}

	public void setPrice_elt(int price_elt) {
		this.price_elt = price_elt;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public void setVacancy_bus(int vacancy_bus) {
		this.vacancy_bus = vacancy_bus;
	}

	public void setVacancy_eco(int vacancy_eco) {
		this.vacancy_eco = vacancy_eco;
	}

	public void setVacancy_elt(int vacancy_elt) {
		this.vacancy_elt = vacancy_elt;
	}
}
