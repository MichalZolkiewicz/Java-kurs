package com.kodilla.good.patterns.challenges.shopservice;

public class OrderData {

    private User user;
    private Product product;

    public OrderData(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
