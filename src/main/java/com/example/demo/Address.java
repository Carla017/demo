package com.example.demo;

public class Address {

    private String streetName;
    private int streetNumber;
    private int aptNumber;
    private String city;

    public Address(String streetName, int streetNumber, int aptNumber, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.aptNumber = aptNumber;
        this.city = city;
    }

    public String getStreetName() {

        return streetName;

    }

    public void setStreetName(String streetname) {

        this.streetName = streetname;
    }

    public int getStreetNumber() {

        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", aptNumber=" + aptNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
