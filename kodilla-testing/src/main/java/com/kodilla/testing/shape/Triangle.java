package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private double field;

    public Triangle(double height, double sideLenght){
        this.shapeName = "triangle";
        this.field = (height*sideLenght)/2;
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
