package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("Collection List Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Testing faze: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Testing faze: end");
    }

    @DisplayName(
            "When List is empty, checks if method OddNumbersExterminator works correctly"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        List<Integer> listWithoutNumbers = new ArrayList<>();
        List<Integer> listWithoutNumbers2 = new ArrayList<>();


        List<Integer> isThisReallyEmptyList = emptyList.exterminate(listWithoutNumbers);
        Assertions.assertEquals(listWithoutNumbers2, isThisReallyEmptyList);

    }
    @DisplayName(
            "When List is filled with numbers, checks if method OddNumbersExterminator is adding only even numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> listWithNumbers = new ArrayList<>(Arrays.asList(1,3,4,6,7,10,13,14,17,19,20,21,22,23,30,31));
        List<Integer> someListWithOddNumbers = new ArrayList<>(Arrays.asList(4,6,10,14,20,22,30));

        List<Integer> theList = OddNumbersExterminator.exterminate(listWithNumbers);

        Assertions.assertEquals(someListWithOddNumbers, theList);
    }
}
