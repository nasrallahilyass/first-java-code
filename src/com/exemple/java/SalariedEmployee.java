package com.exemple.java;

public class SalariedEmployee extends Employee {
    private double Bonus;

    public SalariedEmployee(double bonus) {
        Bonus = bonus;
    }

    public SalariedEmployee(String name, String address, String department, String email, double salary, double bonus) {
        super(name, address, department, email, salary);
        Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    // Method Overriding
    @Override
    public double getSalary() {
        return super.getSalary() + Bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ",Bonus='" + Bonus + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
