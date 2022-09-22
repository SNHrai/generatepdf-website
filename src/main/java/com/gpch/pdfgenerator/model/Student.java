package com.gpch.pdfgenerator.model;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "students")
public class Student {
    
    @Id
    @Field(name = "_id")
    private String id;
    @Field(value = "address.country")
    private String country;
    @Field(value = "address.city")
    private String city;
    @Field(value = "address.postalCode")
    private String postalCode;
    //private Address address;

    public Student() {
    }

   

    


    // public void setAddress(Address address) {
    //     this.address = address;
    // }

    public Student(String id, String country, String city, String postalCode) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
    }






    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Student [city=" + city + ", country=" + country + ", id=" + id + ", postalCode=" + postalCode + "]";
    }

    
    
}

