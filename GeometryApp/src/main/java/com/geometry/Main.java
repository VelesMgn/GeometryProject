package com.geometry;

import org.example.Circle;
import org.example.Rectangle;
import org.example.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());

        System.out.println();

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        System.out.println();

        double areaInCm = UnitConverter.metersToCentimeters(triangle.getArea());
        System.out.println("Triangle area in cm: " + areaInCm);

        boolean areasEqual = ShapeComparator.compareAreas(circle, rectangle);
        System.out.println("Are areas equal? " + areasEqual);
    }
}