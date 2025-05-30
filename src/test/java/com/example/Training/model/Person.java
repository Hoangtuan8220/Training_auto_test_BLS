package com.example.Training.model;

public class Person {
    protected String name;
    int age;
    public int a;
    public int b;

    public Person() {
        //....
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int a_value, int b_value) {
        a = a_value;
        b = b_value;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public int sum() {
        return a + b;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
