package com.exemple.java;


public class Main {
    //Polymorphism (Method Overloading)
    public static float order(float total) {
        return total;
    }

    public static float order(float total, float deliveryCosts) {
        return total + deliveryCosts;

    }

    public static float order(float total, float deliveryCosts, float discountCosts) {
        return total + deliveryCosts - discountCosts;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob Green", "USA", "Finance", "bob.green@mail.uk.co", 4000);
        SalariedEmployee employee2 = new SalariedEmployee("Tom Fisher", "UK", "Development", "tom.fisher@mail.uk.co", 4000, 200);
        DailyEmployee employee3 = new DailyEmployee("Amanda nunes", "MOROCCO", "Insurance", "amanda.nunes@mail.uk.co", 0, 20, 20);
        HourlyEmployee employee4 = new HourlyEmployee("Alex shill", "WELLS", "HR", "alex.shill@mail.uk.co", 0, 20, 7);

        System.out.println("1. Employee Salary: " + employee1.getSalary());
        System.out.println("#######################");
        System.out.println("2. Employee Salary: " + employee2.getSalary());
        System.out.println("#######################");
        System.out.println("3. Employee Salary: " + employee3.getSalary());
        System.out.println("#######################");
        System.out.println("4. Employee Salary: " + employee4.getSalary());
        System.out.println("#######################");

    }

}

