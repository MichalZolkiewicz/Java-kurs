package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTaskQueueTestSuite {

    @Test
    void testUpdate() {
        StudentTaskQueue studentOne = new StudentOneTaskQueue();
        StudentTaskQueue studentTwo = new StudentTwoTaskQueue();
        StudentTaskQueue studentThree = new StudentThreeTaskQueue();

        Mentor mentorOne = new Mentor("John");
        Mentor mentorTwo = new Mentor("Jack");

        studentOne.registerObserver(mentorOne);
        studentTwo.registerObserver(mentorTwo);
        studentThree.registerObserver(mentorOne);

        studentOne.addTask("Create tasks queue");
        studentOne.addTask("Test queues created");
        studentTwo.addTask("Prepare endpoints");
        studentTwo.addTask("Create entities");
        studentThree.addTask("Test entities");
        studentThree.addTask("Test endpoints");

        assertEquals(4, mentorOne.getUpdateCount());
        assertEquals(2, mentorTwo.getUpdateCount());

    }
}