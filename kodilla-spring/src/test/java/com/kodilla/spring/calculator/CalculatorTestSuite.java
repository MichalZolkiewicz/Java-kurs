package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testAddMethod() {
        //When
        double add = calculator.add(3,1);
        //Then
        assertEquals(4, add);
    }

    @Test
    void testSubMethod() {
        //When
        double sub = calculator.sub(3,1);
        //Then
        assertEquals(2, sub);
    }

    @Test
    void testMulMethod() {
        //When
        double mul = calculator.mul(3,2);
        //Then
        assertEquals(6, mul);
    }

    @Test
    void testDivMethod() {
        //When
        double div = calculator.div(6,2);
        //Then
        assertEquals(3, div);
    }
}
