package com.app.fruits;
public class Orange extends Fruit {
    public Orange() {
        super("Orange");
    }

    @Override
    public String taste() {
        return "Sour";
    }

    public void juice() {
        System.out.println(getName() + " tastes " + taste() + ". Can extract juice!");
    }
}

