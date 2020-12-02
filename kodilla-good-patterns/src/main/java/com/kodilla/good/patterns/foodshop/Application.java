package com.kodilla.good.patterns.foodshop;

public class Application {

    public static void main(String[] args) {

        Supplier healthyShop = new HealthyShop();
        Product banana = new Product("Banana");

        DeliveryRequest deliveryRequest = new DeliveryRequest(healthyShop, banana, 3);
        DeliveryProcess deliveryProcess = new DeliveryProcess();
        deliveryProcess.deliver(deliveryRequest);
    }
}
