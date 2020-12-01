package com.kodilla.good.patterns.foodshop;

public class Application {

    public static void main(String[] args) {

        Supplier healthyShop = new HealthyShop();
        Product banana = new Product("Banana", 3);

        DeliveryRequest deliveryRequest = new DeliveryRequest(healthyShop, banana);
        DeliveryProcess deliveryProcess = new DeliveryProcess();

        deliveryProcess.deliver(deliveryRequest);
    }
}
