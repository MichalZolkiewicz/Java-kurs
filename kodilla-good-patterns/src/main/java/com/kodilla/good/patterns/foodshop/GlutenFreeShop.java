package com.kodilla.good.patterns.foodshop;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process () {
        System.out.println("Process 2");
        return true;
    }
}
