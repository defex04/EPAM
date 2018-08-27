package com.company.math;

public class Rectangle {
    private Point diagonalFirstPoint;
    private Point diagonalSecondPoint;

    private Pair firstSide;
    private Pair secondSide;

    private double firstSideLength;
    private double secondSideLength;


    public Rectangle(Point diagonalFirstPoint, Point diagonalSecondPoint) throws Exception {

        if ((Double.compare(diagonalFirstPoint.getX(), diagonalSecondPoint.getX()) == 0)
                || (Double.compare(diagonalFirstPoint.getY(), diagonalSecondPoint.getY()) == 0)) {
            throw new Exception("Неправильно заданы координаты диагонали прямоугольника");
        } else {
            this.diagonalFirstPoint = diagonalFirstPoint;
            this.diagonalSecondPoint = diagonalSecondPoint;
        }

        Pair sides = findRectangleSides(this.diagonalFirstPoint, this.diagonalSecondPoint);

        this.firstSide = (Pair) sides.getA();
        this.secondSide = (Pair) sides.getB();

        this.firstSideLength = getSideLength(this.firstSide);
        this.secondSideLength = getSideLength(this.secondSide);

    }

    public Point getdiagonalFirstPoint() {
        return diagonalFirstPoint;
    }

    public Point getdiagonalSecondPoint() {
        return diagonalSecondPoint;
    }

    Pair getFirstSide() {
        return firstSide;
    }

    Pair getSecondSide() {
        return secondSide;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }


    public double getSquare() {

        return this.firstSideLength * this.secondSideLength;
    }

    private static Pair<Pair<Point, Point>, Pair<Point, Point>> findRectangleSides(Point A, Point B) throws Exception {

        Point sideA = new Point(A.getX(), B.getY());
        Point sideB = new Point(A.getX(), B.getY());

        return new Pair<>(new Pair<>(A, sideA), new Pair<>(B, sideB));
    }

    private static double getSideLength(Pair side) {

        Point A = (Point) side.getA();
        Point B = (Point) side.getB();
        double x1 = A.getX();
        double x2 = B.getX();
        double y1 = A.getY();
        double y2 = B.getY();

        double result;
        if (Double.compare(x1, x2) == 0)
            result = Math.abs(y2 - y1);

        else result = Math.abs(x2 - x1);

        return result;
    }
}
