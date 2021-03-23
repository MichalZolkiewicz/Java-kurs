package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderGetCost() {
        PizzaOrder pizza = new BasicPizzaOrder();

        BigDecimal theCost = pizza.getCost();

        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    void testBasicPizzaOrderGetDescription() {
        PizzaOrder pizza = new BasicPizzaOrder();

        String description = pizza.getDescription();

        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    void testPizzaOrderWithExtraCheeseGetCost() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);

        BigDecimal theCost = pizza.getCost();

        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    void testPizzaOrderWithExtraCheeseGetDescription() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);

        String description = pizza.getDescription();

        assertEquals("Pizza with tomato sauce and cheese + extra cheese", description);
    }

    @Test
    void testPizzaOrderWithPepperoniAndHamAndExtraCheeseGetCost() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithPepperoniAndHamDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);

        BigDecimal theCost = pizza.getCost();

        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    void testPizzaOrderWithPepperoniAndHamAndExtraCheeseGetDescription() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithPepperoniAndHamDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);

        String description = pizza.getDescription();

        assertEquals("Pizza with tomato sauce and cheese, pepperoni and ham + extra cheese", description);
    }

    @Test
    void testExpressDeliveryPizzaOrderWithPepperoniAndHamGetCost() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithPepperoniAndHamDecorator(pizza);
        pizza = new PizzaOrderExpressDelivery(pizza);

        BigDecimal theCost = pizza.getCost();

        assertEquals(new BigDecimal(45), theCost);
    }

    @Test
    void testExpressDeliveryPizzaOrderWithPepperoniAndHamGetDescription() {
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithPepperoniAndHamDecorator(pizza);
        pizza = new PizzaOrderExpressDelivery(pizza);

        String description = pizza.getDescription();

        assertEquals("Express delivery: Pizza with tomato sauce and cheese, pepperoni and ham", description);
    }

}