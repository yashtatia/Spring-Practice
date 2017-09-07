package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flt_fleet")
public class Fleet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer fleet_id;

	@OneToMany(mappedBy = "fleet_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SubFlight> flights = new ArrayList<SubFlight>();

	@NotNull
	private String manuf;

	@NotNull
	private String model;

	public Integer getFleet_id() {
		return fleet_id;
	}

	public List<SubFlight> getFlights() {
		return flights;
	}

	public String getManuf() {
		return manuf;
	}

	public String getModel() {
		return model;
	}

	public void setFleet_id(Integer fleet_id) {
		this.fleet_id = fleet_id;
	}

	public void setFlights(List<SubFlight> flights) {
		this.flights = flights;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
