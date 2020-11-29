package com.kodilla.good.patterns.challenges.shopservice;

public class OrderService {

    public boolean order(User user, Product product) {
        System.out.println("Creating order..." + "\nOrder for: " + user.getName() + "\nChosen product: " + product);
        return true;
    }
}
