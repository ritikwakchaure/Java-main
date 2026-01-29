package com.app.fruits;

// Mango class
public class Mango extends Fruit {
    public Mango() {
        super("Mango");
    }

    @Override
    public String taste() {
        return "Sweet";
    }

    public void pulp() {
        System.out.println(getName() + " tastes " + taste() + ". Can be pulped!");
    }
}