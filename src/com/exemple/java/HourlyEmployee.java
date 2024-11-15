package com.exemple.java;

public class HourlyEmployee extends Employee {
    private double workHoursPrice;
    private int hourlyRate;

    public HourlyEmployee(int hourlyRate, double workHoursPrice) {
        this.hourlyRate = hourlyRate;
        this.workHoursPrice = workHoursPrice;
    }

    public HourlyEmployee(String name, String address, String department, String email, double salary, int hourlyRate, double workHoursPrice) {
        super(name, address, department, email, salary);
        this.hourlyRate = hourlyRate;
        this.workHoursPrice = workHoursPrice;
    }


    public double getWorkHoursPrice() {
        return workHoursPrice;
    }

    public void setWorkHoursPrice(double workHoursPrice) {
        this.workHoursPrice = workHoursPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Method Overriding
    @Override
    public double getSalary() {
        return workHoursPrice * hourlyRate;
    }


    @Override
    public void print() {
        System.out.println("Hourly Employee");
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", workHoursPrice=" + workHoursPrice +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + getSalary() +
                '}';
    }
}
