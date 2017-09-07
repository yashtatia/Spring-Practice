package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="flt_fleet")
public class Fleet {

	@Id
	@GeneratedValue
	private Integer plane_id;
	
	@NotNull
	private String manuf;
	
	@NotNull
	private String model;

	public String getManuf() {
		return manuf;
	}

	public String getModel() {
		return model;
	}

	public Integer getPlane_id() {
		return plane_id;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPlane_id(Integer plane_id) {
		this.plane_id = plane_id;
	}
}
