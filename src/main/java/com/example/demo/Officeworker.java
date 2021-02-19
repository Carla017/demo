package com.example.demo;

public class Officeworker extends Employee {
    private int idPosition;
    private int iq;

    public Officeworker(int id, String name, String lastname, int age, int experience, int idPosition, int iq, Address address ) {
        super(id, name, lastname, age, experience, address);

        this.idPosition = idPosition;
        this.iq = iq;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public double getCorporationValue() {
        return super.getExperience() * iq;
    }

    @Override
    public String toString() {
        return "Officeworker{" +
                "idPosition=" + idPosition +
                ", iq=" + iq +
                "} " + super.toString();
    }
}
