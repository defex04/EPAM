package com.company;

import com.company.math.Point;
import com.company.math.Rectangle;
import com.company.math.RectangleCrossing;

public class Main {

    public static void main(String[] args) throws Exception {
        Point a = new Point(2.0, 2.0);
        Point b = new Point(6.0, 5.0);

        Point a2 = new Point(5.0, 3.0);
        Point b2 = new Point(9.0, 5.0);

        Rectangle rectangle1 = new Rectangle(a, b);
        Rectangle rectangle2 = new Rectangle(a2, b2);

        System.out.println("Площадь первого прямоугольника: " + rectangle1.getSquare());
        System.out.println("Площадь второго прямоугольника: " + rectangle2.getSquare());

        RectangleCrossing rc = new RectangleCrossing(rectangle1, rectangle2);

        System.out.println("Площадь пересечения прямоугольников: " + rc.getCrossingSquare());
    }
}
