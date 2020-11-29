package com.kodilla.good.patterns.challenges.shopservice;

public class Product {

    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;

    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
