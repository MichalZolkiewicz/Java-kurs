package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {

    private String shapeName;
    private double field;

    public Circle(double radius) {
        this.shapeName = "circle";
        this.field = PI*(radius*radius);
    }

    @Override
    public String getShapeName() {
            return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "This is " + shapeName + " and it's field = " + field;
    }
}
