package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Christmas shopping", "Christmas lights", 3.0);
            case PAINTING:
                return new PaintingTask("Paint the wall", "Ocean", "Blue");
            case DRIVING:
                return new DrivingTask("Driving", "home", "car");
            default:
                return null;
        }
    }
}
