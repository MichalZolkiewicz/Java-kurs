package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Calculator calculator = context.getBean(Calculator.class);

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
