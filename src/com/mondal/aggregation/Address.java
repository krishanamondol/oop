package com.mondal.aggregation;

public class Address {
    String city,devision,country;

    public Address(String city, String devision, String country) {
        this.city = city;
        this.devision = devision;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDevision() {
        return devision;
    }

    public void setDevision(String devision) {
        this.devision = devision;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
