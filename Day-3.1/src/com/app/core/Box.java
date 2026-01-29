package com.app.core;

// Box.java
public class Box {
    // Properties (attributes)
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return length * width * height;
    }

    // Method to calculate surface area
    public double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to display box details
    public void displayBox() {
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
        System.out.println("Volume: " + volume());
        System.out.println("Surface Area: " + surfaceArea());
    }
}
