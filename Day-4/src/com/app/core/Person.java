package com.app.core;

public class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        // This will print first when any child is created
        System.out.println("in person's ctor");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}