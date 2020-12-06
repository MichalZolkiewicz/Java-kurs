package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        display.displayValue(a+b);
        return a+b;
    }

    public double sub(double a, double b) {
        display.displayValue(a-b);
        return a-b;
    }

    public double mul(double a, double b) {
        display.displayValue(a*b);
        return a*b;
    }

    public double div(double a, double b) {
        display.displayValue(a/b);
        return a/b;
    }
}
