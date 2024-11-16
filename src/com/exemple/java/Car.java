package com.exemple.java;

public abstract class Car {
    private int numberOfWheels;
    private float height;
    private float weight;


    // Constructors:
    public Car() {
    }

    public Car(int numberOfWheels, float height, float weight) {
        this.numberOfWheels = numberOfWheels;
        this.height = height;
        this.weight = weight;
    }

    // Methods (Abstracted)
    abstract void autoPilot();

    abstract void streamingServices();

    abstract void parkingSensors();


    // Getters and Setters:
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
