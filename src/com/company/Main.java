package com.company;

import com.company.math.Point;
import com.company.math.Rectangle;

public class Main {

    public static void main(String[] args) throws Exception {
        Point a = new Point(2.0, 5.0);
        Point b = new Point(10.0, 2.0);

        Rectangle rectangle = new Rectangle(a,b);
        System.out.println(rectangle.getSquare());

    }
}
