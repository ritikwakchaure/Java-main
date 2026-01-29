package com.app.geometry;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;

        
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // distance between this point and another point

    public double calculateDistance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
