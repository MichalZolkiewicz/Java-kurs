package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        List<Integer> listWithoutNumbers = new ArrayList<>();
        OddNumbersExterminator emptyList = new OddNumbersExterminator();

        emptyList.exterminate(listWithoutNumbers);
        System.out.println(emptyList.exterminate(listWithoutNumbers));
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
        normalList.exterminate(listWithNumbers);
        System.out.println(normalList.exterminate(listWithNumbers));
    }
}
