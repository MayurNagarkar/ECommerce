package com.amazon.model;

public class Address {

	private String street;
	private String city;
	private String state;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String showAddress() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
