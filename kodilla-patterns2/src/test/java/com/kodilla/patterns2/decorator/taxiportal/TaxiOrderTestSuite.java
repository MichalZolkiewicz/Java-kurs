package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaxiOrderTestSuite {

    @Test
    void testBasicTaxiOrderGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        BigDecimal calculateCost = theOrder.getCost();

        assertEquals(new BigDecimal(5), calculateCost);
    }

    @Test
    void testBasicTaxiOrderGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        String description = theOrder.getDescription();

        assertEquals("Drive a course", description);
    }

    @Test
    void testTaxiNetworkGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    void testTaxiNetworkGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(52), theCost);
    }

    @Test
    void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by MyTaxi Network express service variant VIP + child seat", description);
    }
}
