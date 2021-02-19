package com.example.demo;

public abstract class Employee {

    private int id;
    private String name;
    private String lastname;
    private int age;
    private int experience;

    private Address address;


    public Employee(int id, String name, String lastname, int age, int experience, Address address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }






    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public abstract double getCorporationValue();

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", address=" + address +
                '}';
    }
}
