package com.exemple.java;

public class DailyEmployee extends Employee {
    private float workDailyPrice;
    private int dailyRate;

    public DailyEmployee(float workDailyPrice, int dailyRate) {
        this.workDailyPrice = workDailyPrice;
        this.dailyRate = dailyRate;
    }

    public DailyEmployee(String name, String address, String department, String email, double salary, float workDailyPrice, int dailyRate) {
        super(name, address, department, email, salary);
        this.workDailyPrice = workDailyPrice;
        this.dailyRate = dailyRate;
    }

    public float getWorkDailyPrice() {
        return workDailyPrice;
    }

    public void setWorkDailyPrice(float workDailyPrice) {
        this.workDailyPrice = workDailyPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method Overriding
    @Override
    public double getSalary() {
        return workDailyPrice * dailyRate;
    }


    @Override
    public void print() {
        System.out.println("Daily Employee");
    }

    @Override
    public String toString() {
        return "DailyEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", workDailyPrice=" + workDailyPrice +
                ", dailyRate=" + dailyRate +
                ", salary=" + getSalary() +
                '}';
    }
}
