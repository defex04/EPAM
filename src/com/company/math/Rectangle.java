package com.company.math;

public class Rectangle {
    private Point A;
    private Point B;

    public Rectangle(Point A, Point B) throws Exception {

        if ( (Double.compare(A.getX(), B.getX()) == 0) || (Double.compare(A.getY(), B.getY()) == 0) )  {
            throw new Exception("Неправильно заданы координаты диагонали прямоугольника");
        }
        else {
            this.A = A;
            this.B = B;
        }
    }

    public double getSquare() throws Exception {
        Pair sides;
        Pair a;
        Pair b;

        sides = findRectangleSides(this.A, this.B);

        a = (Pair) sides.getA();
        b = (Pair) sides.getB();

        double sideA = getSideLength(a);
        double sideB = getSideLength(b);

        return sideA * sideB;
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

        System.out.println("Point: " + "(" + x1 + ", " + y1 + ")");
        System.out.println("Point: " + "(" + x2 + ", " + y2 + ")");
        System.out.println("Side length: " + result);

        return result;
    }
}
