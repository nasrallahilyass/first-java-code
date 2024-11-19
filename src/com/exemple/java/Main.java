package com.exemple.java;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        // HashMap:
        hashMap.put(1, "Alex");
        hashMap.put(2, "Max");
        hashMap.put(3, "Ketty Perry");
        hashMap.put(4, "Sam Smith");
        hashMap.put(5, "Lucy Green");

        // HashSet:
        hashSet.add("Alex");
        hashSet.add("Max");
        hashSet.add("Ketty Perry");
        hashSet.add("Alex");
        hashSet.remove("Max");
        hashSet.clear();


        System.out.println("####################################################");
        System.out.println("####################################################");
        System.out.println(hashMap);
        System.out.println("####################################################");
        System.out.println(hashMap.get(1));
        System.out.println("####################################################");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println("####################################################");
        System.out.println("####################################################");
        System.out.println("####################################################");
        System.out.println(hashSet);


    }
}

