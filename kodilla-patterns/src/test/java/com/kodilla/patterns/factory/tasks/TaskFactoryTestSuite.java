package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Christmas shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("Paint the wall", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}
