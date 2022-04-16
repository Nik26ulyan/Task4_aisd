package ru.vsu.sc.uliyanov_n_s;

public class MyPoint {
    double x;
    double y;
    double distanceToCenter;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
        this.distanceToCenter = getDistanceToCenter(Math.abs(x), Math.abs(y));
    }

    private static double getDistanceToCenter(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public double[] toArray() {
        return new double[] {x, y};
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }
}
