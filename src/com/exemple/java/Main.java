package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(); // Instantiation

        phone.brand = "iphone";
        phone.os = "ios";
        phone.model = "iphone 16 pro max";
        phone.color = "red";

        phone.Ring();
        phone.Video();

        // Anonymous Object
        // An anonymous object is created without being assigned a reference.
        new Phone().Ring();

        // Access Modifiers
        /*
        public: Accessible from any other class.
        protected: Accessible within the same package and by subclasses.
        default (no modifier): Accessible only within the same package.
        private: Accessible only within the declared class.
         */
    }
}
