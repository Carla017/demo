package com.example.demo;

public enum Efficiency {

    LOW(60),
    MEDIUM(90),
    HIGH(120);

    private final int value;

    private Efficiency(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
