package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(3,1);
        double sub = calculator.sub(3,1);
        double mul = calculator.mul(3,2);
        double div = calculator.div(6,2);



        //Then
        assertEquals(4, add);
        assertEquals(2, sub);
        assertEquals(6, mul);
        assertEquals(3, div);

    }
}
