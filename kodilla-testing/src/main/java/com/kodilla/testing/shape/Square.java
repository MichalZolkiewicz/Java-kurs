package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double field;

    public Square( double sideLenght){
        this.shapeName = "square";
        this.field = sideLenght*sideLenght;
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
