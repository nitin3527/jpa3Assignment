package com.jpa3.jpa3.entites;

import javax.persistence.Embeddable;

@Embeddable
public class Address { //Q1
    private String streetnum;
    private String location;
    private String state;

    public String getStreetnum() {
        return streetnum;
    }

    public void setStreetnum(String streetnum) {
        this.streetnum = streetnum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
