package com.rc.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/2/17.
 */
@Entity
@Table(name = "T_ADDRESS")
public class Address implements Serializable{

    @javax.persistence.Id
    @GeneratedValue
    private Long Id;
    @Column(nullable = false)
    private String addressId;
    @Column(nullable = false)
    private String streetName;

    public Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    public Address(String addressId, String streetName, String houseNumber, String county, String city, String state, int zip) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Column
    private String houseNumber;
    @Column
    private String county;
    @Column
    private String city;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Column
    private String state;
    @Column
    private int zip;
}
