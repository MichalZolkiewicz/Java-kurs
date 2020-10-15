package com.kodilla.testing.shape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector(List<Shape> shapes) {

        this.shapes = shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }else{
            return null;
        }
    }

    public List<Shape> showFigures() {
        for(Shape figures: shapes) {
            System.out.println(figures);
        }
        return shapes;
    }

    @Override
    public String toString() {
        return "The list of ShapeCollector: " + shapes;
    }

}
