package com.company.math;

public class RectangleCrossing {

    private Rectangle first;
    private Rectangle second;

    public RectangleCrossing(Rectangle first, Rectangle second) {
        this.first = first;
        this.second = second;
    }

    public double getCrossingSquare() {

        Pair firstRectangleFirstSide = first.getFirstSide();
        Pair firstRectangleSecondSide = first.getSecondSide();
        Pair secondRectangleFirstSide = second.getFirstSide();
        Pair secondRectangleSecondSide = second.getSecondSide();

        Point firstRectangleFirstSidePointA = (Point) firstRectangleFirstSide.getA();
        Point firstRectangleFirstSidePointB = (Point) firstRectangleFirstSide.getB();
        Point firstRectangleSecondSidePointA = (Point) firstRectangleSecondSide.getA();
        Point firstRectangleSecondSidePointB = (Point) firstRectangleSecondSide.getB();

        double firstRectangleLeft = Math.min(Math.min(firstRectangleFirstSidePointA.getX(),
                firstRectangleFirstSidePointB.getX()),
                Math.min(firstRectangleSecondSidePointA.getX(),
                        firstRectangleSecondSidePointB.getX()));

        double firstRectangleRight = Math.max(Math.max(firstRectangleFirstSidePointA.getX(),
                firstRectangleFirstSidePointB.getX()),
                Math.max(firstRectangleSecondSidePointA.getX(),
                        firstRectangleSecondSidePointB.getX()));

        double firstRectangleTop = Math.min(Math.min(firstRectangleFirstSidePointA.getY(),
                firstRectangleFirstSidePointB.getY()),
                Math.min(firstRectangleSecondSidePointA.getY(),
                        firstRectangleSecondSidePointB.getY()));

        double firstRectangleBottom = Math.max(Math.max(firstRectangleFirstSidePointA.getY(),
                firstRectangleFirstSidePointB.getY()),
                Math.max(firstRectangleSecondSidePointA.getY(),
                        firstRectangleSecondSidePointB.getY()));


        Point secondRectangleFirstSidePointA = (Point) secondRectangleFirstSide.getA();
        Point secondRectangleFirstSidePointB = (Point) secondRectangleFirstSide.getB();
        Point secondRectangleSecondSidePointA = (Point) secondRectangleSecondSide.getA();
        Point secondRectangleSecondSidePointB = (Point) secondRectangleSecondSide.getB();

        double secondRectangleLeft = Math.min(Math.min(secondRectangleFirstSidePointA.getX(),
                secondRectangleFirstSidePointB.getX()),
                Math.min(secondRectangleSecondSidePointA.getX(),
                        secondRectangleSecondSidePointB.getX()));

        double secondRectangleRight = Math.max(Math.max(secondRectangleFirstSidePointA.getX(),
                secondRectangleFirstSidePointB.getX()),
                Math.max(secondRectangleSecondSidePointA.getX(),
                        secondRectangleSecondSidePointB.getX()));

        double secondRectangleTop = Math.min(Math.min(secondRectangleFirstSidePointA.getY(),
                secondRectangleFirstSidePointB.getY()),
                Math.min(secondRectangleSecondSidePointA.getY(),
                        secondRectangleSecondSidePointB.getY()));

        double secondRectangleBottom = Math.max(Math.max(secondRectangleFirstSidePointA.getY(),
                secondRectangleFirstSidePointB.getY()),
                Math.max(secondRectangleSecondSidePointA.getY(),
                        secondRectangleSecondSidePointB.getY()));


        double left = Math.max(firstRectangleLeft, secondRectangleLeft);
        double right = Math.min(firstRectangleRight, secondRectangleRight);
        double top = Math.max(firstRectangleTop, secondRectangleTop);
        double bottom = Math.min(firstRectangleBottom, secondRectangleBottom);


        return Math.max(Math.abs(right - left), 0) * Math.max(Math.abs(bottom - top), 0);
    }
}
