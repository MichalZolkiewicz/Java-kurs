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
        List<Integer> listWithNumbers = new ArrayList<>();
        Random generator = new Random();

        for(int i=0; i<50; i++) {
            int randomValue = generator.nextInt(100);
            listWithNumbers.add(randomValue);
        }
        OddNumbersExterminator normalList = new OddNumbersExterminator();
        List<Integer> listWithOddNumbers = normalList.exterminate(listWithNumbers);
        Assertions.assertNotEquals(listWithNumbers, listWithOddNumbers);
        System.out.println(listWithOddNumbers);

    }
}
