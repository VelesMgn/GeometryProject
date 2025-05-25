package com.geometry;

import org.example.Circle;
import org.example.Rectangle;

public class ShapeComparator {
    public static boolean compareAreas(Circle c, Rectangle r) {
        return Math.abs(c.getArea() - r.getArea()) < 0.0001;
    }
}