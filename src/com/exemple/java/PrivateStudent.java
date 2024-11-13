package com.exemple.java;

// Multilevel Inheritance
public class PrivateStudent extends Student {
    private double monthlyFee;

    public PrivateStudent() {
    }


    public PrivateStudent(String name, int age, String course, int grade, double monthlyFee) {
        super(name, age, course, grade);
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
