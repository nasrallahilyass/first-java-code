package com.exemple.java;

public class Phone {

    // Fields:
    private String os;
    private String model;
    private String color;
    private int year;
    private String name;

    // Constructors

    public Phone() {
    }

    public Phone(String os, String name, String color, int year, String model) {
        this.os = os;
        this.name = name;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public Phone(String name) {
        this.name = name;
    }

    // Getters and Setters:
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods:
    public void Ring() {
        System.out.println("Ring...");
    }

    public void Video() {
        System.out.println("Filming a Video...");
    }
}
