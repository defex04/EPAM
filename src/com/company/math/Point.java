package com.company.math;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) throws Exception {
        if ( (Double.compare(x, 0.0) < 0) || Double.compare(y, 0.0) < 0 ) {
            throw new Exception("Числа не могут быть отрицательными");
        }
        else {
            this.x = x;
            this.y = y;
        }
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}
