package com.example.demo;

public class Manualworker extends Employee {
    private int strength;

    public Manualworker(int id, String name, String lastname, int age, int experience, int strength, Address address) {
        super(id, name, lastname, age, experience, address);

        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public double getCorporationValue() {
        return super.getExperience() * strength / super.getAge();
    }

    @Override
    public String toString() {
        return "Manualworker{" +
                "strength=" + strength +
                "} " + super.toString();
    }
}
