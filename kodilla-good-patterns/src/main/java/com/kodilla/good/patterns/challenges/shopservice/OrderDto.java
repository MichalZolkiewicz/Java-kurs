package com.kodilla.good.patterns.challenges.shopservice;

public class OrderDto {

    private User user;
    private boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
