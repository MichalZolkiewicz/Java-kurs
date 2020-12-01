package com.kodilla.good.patterns.foodshop;

public class DeliveryProcess {

    public void deliver(DeliveryRequest deliveryRequest) {
        boolean readyToDeliver = deliveryRequest.getSupplier().process();
        if(readyToDeliver) {
            System.out.println("Delivery from: " + deliveryRequest.getSupplier() + ", for: "
                                + deliveryRequest.getProduct().getProductQuantity()
                                + " " + deliveryRequest.getProduct().getProductName());
        }else {
            System.out.println("Delivery failed!");
        }
    }
}
