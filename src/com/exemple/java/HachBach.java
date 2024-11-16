package com.exemple.java;

public class HachBach extends Car {

    //Contracture:
    public HachBach() {
    }

    public HachBach(int numberOfWheels, float height, float weight) {
        super(numberOfWheels, height, weight);
    }

    @Override
    void autoPilot() {
        System.out.println("HachBach autoPilot. START!");
    }

    @Override
    void streamingServices() {
        System.out.println("HachBach streamingServices. START!");
    }

    @Override
    void parkingSensors() {
        System.out.println("HachBach parkingSensors. START!");
    }

    @Override
    public String toString() {
        return "HachBach{ " +
                "numberOfWheels: " + getNumberOfWheels() + '\'' +
                ", height: " + getHeight() + '\'' +
                ", weight: " + getWeight() + '\'' +
                " }";
    }
}
