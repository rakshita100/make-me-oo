package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceValue(Point p1, Point p2) {
        double x_value = p2.x - p1.x;
        double y_value = p2.y - p1.y;
        return Math.sqrt(Math.pow(x_value, 2) + Math.pow(y_value, 2));
    }

    public static double directionValue(Point p1, Point p2) {
        double x_value = p2.x - p1.x;
        double y_value = p2.y - p1.y;
        return Math.atan2(y_value, x_value);
    }

}
