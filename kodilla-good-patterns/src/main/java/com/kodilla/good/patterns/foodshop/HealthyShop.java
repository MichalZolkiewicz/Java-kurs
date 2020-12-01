package com.kodilla.good.patterns.foodshop;

public class HealthyShop implements Supplier {

    @Override
    public boolean process() {
        System.out.println("Process 3");
        return true;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
