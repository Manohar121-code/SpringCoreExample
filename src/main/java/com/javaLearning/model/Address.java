package com.javaLearning.model;

public class Address {

	private String city;
	private String Country;
	
	public Address() {
		
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		Country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + "]";
	}

}
