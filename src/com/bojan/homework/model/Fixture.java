package com.bojan.homework.model;

import java.util.List;

public class Fixture {
	private int status;
	private String name;
	private List<Property> properties;
	private String address;
	private String serial;
	private String statusDescription;

	public Fixture() {

	}

	public Fixture(int status, String name, List<Property> properties,
			Supply supply, String serial, String statusDescription) {
		this.status = status;
		this.name = name;
		this.properties = properties;
		this.address = supply.getAddress();
		this.serial = serial;
		this.statusDescription = statusDescription;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(Supply supply) {
		this.address = supply.getAddress();
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "Fixture [status=" + status + ", name=" + name + "]";
	}
}
