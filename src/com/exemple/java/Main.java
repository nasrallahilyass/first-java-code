package com.exemple.java;

import com.example.project.Account;

public class Main {
    public static void main(String[] args) {
        /*
            Inheritance Type	        Description
            Single Inheritance	        A class inherits from one superclass only.
            Multilevel Inheritance	    A class inherits from a superclass, which itself inherits another class.
            Hierarchical Inheritance	Multiple classes inherit from the same superclass.
            Multiple Inheritance	    Achieved with interfaces (not direct class inheritance).
     */
        Student newStudent = new Student("Ilyass", 24, "English", 18);
        PrivateStudent newPrivateStudent = new PrivateStudent("Bennis", 22, "Business", 20, 9000);
        PublicStudent newPublicStudent = new PublicStudent("Ali", 18, "Physics", 12, 100);

        System.out.println("#################################");
        System.out.println(
                "Your name is " + newStudent.getName()
                        + "\nYour age is " + newStudent.getAge()
                        + "\nThe course name: " + newStudent.getCourse()
                        + "\nThe course grade: " + newStudent.getGrade()
        );
        System.out.println("#################################");
        System.out.println(
                "Your name is " + newPublicStudent.getName()
                        + "\nYour age is " + newPublicStudent.getAge()
                        + "\nThe course name: " + newPublicStudent.getCourse()
                        + "\nThe course grade: " + newPublicStudent.getGrade()
                        + "\nYour Fee is: " + newPublicStudent.getOneTimeFee()
        );
        System.out.println("#################################");
        System.out.println(
                "Your name is " + newPrivateStudent.getName()
                        + "\nYour age is " + newPrivateStudent.getAge()
                        + "\nThe course name: " + newPrivateStudent.getCourse()
                        + "\nThe course grade: " + newPrivateStudent.getGrade()
                        + "\nYour Monthly Fee is: " + newPrivateStudent.getMonthlyFee()
        );

        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");

        Account acc1 = new Account(10001, "Mr.Ilyass", 3000);
        Account acc2 = new Account(10002, "Mr.Bennis", 30000);
        Account acc3 = new Account(acc2);
        acc1.deposit(1000);
        acc1.withdraw(5000);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

    }

}

