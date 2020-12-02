package com.kodilla.good.patterns.challenges.shopservice;

public class Application {

    public static void main(String[] args) {

        User user = new User("Michał Żółkiewicz","Głowackiego 5/19", "zolkiewicz.michal@gmail.com");
        Product product = new Product("PS 5");

        InformationService informationService = new EmailNotificator();
        OrderService orderService = new OrderService();
        OrderRepository orderRepository = new OrderCreator();
        ProductOrderService productOrderService = new ProductOrderService(orderService, informationService, orderRepository);
        OrderData orderData = new OrderData(user, product);

        productOrderService.process(orderData);
    }
}
