package com.exemple.java;

// Single Level Inheritance
public class Student extends Person {

    private String course;
    private int grade;

    public Student() {
        super();
    }

    public Student(String name, int age, String course, int grade) {
        super(name, age);
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
