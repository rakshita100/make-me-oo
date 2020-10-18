package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return Point.distanceValue(from, to);
    }

    public static double direction(Point from, Point to) {
        return Point.directionValue(from, to);
    }
}
