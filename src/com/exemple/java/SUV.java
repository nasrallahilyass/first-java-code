package com.exemple.java;

public class SUV extends Car {

    //Contracture:


    public SUV() {
    }

    public SUV(int numberOfWheels, float height, float weight) {
        super(numberOfWheels, height, weight);
    }

    @Override
    void autoPilot() {
        System.out.println("SUV Auto Pilot. START! ");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV StreamingServices. START! ");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV ParkingSensors. START! ");
    }

    @Override
    public String toString() {
        return "SUV{ " +
                "numberOfWheels: " + getNumberOfWheels() + '\'' +
                ", height: " + getHeight() + '\'' +
                ", weight: " + getWeight() + '\'' +
                " }";
    }
}
