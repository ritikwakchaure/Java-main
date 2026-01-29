package com.app.fruits;

// Base class
public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String taste() {
        return "no specific taste";
    }
}
