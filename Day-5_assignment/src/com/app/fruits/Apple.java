package com.app.fruits;


public class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }

    @Override
    public String taste() {
        return "Sweet & Sour";
    }

    public void jam() {
        System.out.println(getName() + " tastes " + taste() + ". Can make jam!");
    }
}