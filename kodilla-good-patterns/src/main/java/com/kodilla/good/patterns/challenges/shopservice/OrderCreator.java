package com.kodilla.good.patterns.challenges.shopservice;

public class OrderCreator implements OrderRepository {

    @Override
    public void order(User user, Product product) {
        System.out.println("New order for: " + user.getName() + ", product: " + product.getProductName() + ", shipping address: " + user.getAddress());
    }
}
