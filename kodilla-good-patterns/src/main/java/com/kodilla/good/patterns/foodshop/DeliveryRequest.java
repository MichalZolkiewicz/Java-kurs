package com.kodilla.good.patterns.foodshop;

public class DeliveryRequest {

    Supplier supplier;
    Product product;

    public DeliveryRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
