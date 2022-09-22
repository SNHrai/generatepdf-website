package com.gpch.pdfgenerator.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Address {

	
    @Field(name = "country")
    private String country;
    @Field(name = "city")
    private String city;
    @Field(name = "postalCode")
    private String postalCode;

  
  
  public Address() {
	super();
	// TODO Auto-generated constructor stub
}



public Address(String country, String city, String postalCode) {
	super();
	this.country = country;
	this.city = city;
	this.postalCode = postalCode;
}



public String getCountry() {
	return country;
}



public void setCountry(String country) {
	this.country = country;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getPostalCode() {
	return postalCode;
}



public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}



@Override
public String toString() {
	return "Address [country=" + country + ", city=" + city + ", postalCode=" + postalCode + "]";
}
  
  
  
  
}
