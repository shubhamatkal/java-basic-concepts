package com;

public class Person {
    public String name;       // Public: Accessible anywhere
    int age;                  // Default: Accessible only within the same package
    protected String address; // Protected: Accessible within the same package and subclasses

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

