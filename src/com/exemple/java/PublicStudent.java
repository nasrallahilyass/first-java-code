package com.exemple.java;

// Multilevel Inheritance
public class PublicStudent extends Student {
    private double OneTimeFee;

    public PublicStudent() {
    }

    public PublicStudent(String name, int age, String course, int grade, double OneTimeFee) {
        super(name, age, course, grade);
        this.OneTimeFee = OneTimeFee;
    }

    public double getOneTimeFee() {
        return OneTimeFee;
    }

    public void setOneTimeFee(double oneTimeFee) {
        OneTimeFee = oneTimeFee;
    }
}
