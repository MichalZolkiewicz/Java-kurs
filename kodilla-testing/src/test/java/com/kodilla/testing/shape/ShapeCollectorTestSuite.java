package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("TDD ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting to proceed all the tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All test completed");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Commencing test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing shapes")
    public class AddShapeRemoveShape {

        @Test
        public void testAddFigure() {
            //Given
            Circle circle = new Circle(20);
            Triangle triangle = new Triangle(10, 15);
            Square square = new Square(10);

            ShapeCollector theList = new ShapeCollector(new ArrayList<>(Arrays.asList(square, triangle)));
            ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(square, triangle, circle)));

            int expectedListSize = expectedList.showFigures().size();

            //When
            theList.addFigure(circle);
            int theListSize = theList.showFigures().size();

            //Then
            Assertions.assertEquals(expectedListSize, theListSize);

        }

        @Test
        public void testRemoveFigure() {
            //Given
            Circle circle = new Circle(20);
            Triangle triangle = new Triangle(10, 15);
            Square square = new Square(10);

            ShapeCollector theList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, triangle, square)));
            ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape> (Arrays.asList(circle, triangle)));

            int expectedListSize = expectedList.showFigures().size();

            //When
            theList.removeFigure(square);
            int theListSize = theList.showFigures().size();

            //Then
            Assertions.assertEquals(expectedListSize, theListSize);
        }
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(20);
        Triangle triangle = new Triangle(10, 15);
        Square square = new Square(10);

        ShapeCollector theList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, triangle, square)));

        //When
        Shape shape1 = theList.getFigure(1);
        Shape shape2 = theList.getFigure(-1);
        Shape shape3 = theList.getFigure(3);

        //Then
        Assertions.assertEquals(triangle, shape1);
        Assertions.assertEquals(null, shape2);
        Assertions.assertEquals(null, shape3);
    }

    @Test
    public void testShowFigures() {
        Circle circle = new Circle(20);
        Triangle triangle = new Triangle(10, 15);
        Square square = new Square(10);

        ArrayList<Shape> theList = new ArrayList<Shape>(Arrays.asList(circle, triangle, square));
        ShapeCollector theCollection = new ShapeCollector(theList);

        Assertions.assertEquals(theList, theCollection.showFigures());

    }
}

