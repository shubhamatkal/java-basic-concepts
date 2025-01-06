package com;


public class Student extends Person {

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    // Inheriting and modifying displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Student Info: " + name + ", Age: " + age + ", Address: " + address);
    }
}

