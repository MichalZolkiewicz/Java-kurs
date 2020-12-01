package com.kodilla.good.patterns.foodshop;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process() {
        System.out.println("Process 1");
        return false;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
