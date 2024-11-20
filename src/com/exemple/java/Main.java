package com.exemple.java;


import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("#############################");
        System.out.println("####### Serialization #######");
        System.out.println("#############################");

        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student(111, "John Warthog", 8.5));
        studentsList.add(new Student(222, "Mary Doe", 9.0));
        studentsList.add(new Student(333, "Jane Doe", 9.5));
        studentsList.add(new Student(444, "John Doe", 8.0));

        File file = new File("students.txt");

        // Serialization
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {

            out.writeObject(studentsList);
            System.out.println("Students have been serialized successfully.");

        } catch (IOException e) {
            System.err.println("Error occurred during serialization: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("#############################");
        System.out.println("####### Deserialization #######");
        System.out.println("#############################");

        // Deserialization
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            ArrayList<Student> deserializedStudentsList = (ArrayList<Student>) ois.readObject();
            System.out.println("Deserialized Students:");
            for (Student student : deserializedStudentsList) {
                System.out.println(student);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error occurred during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

