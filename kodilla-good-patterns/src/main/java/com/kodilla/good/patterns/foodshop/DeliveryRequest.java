package com.kodilla.good.patterns.foodshop;

public class DeliveryRequest {

    private Supplier supplier;
    private Product product;
    private int productQuantity;

    public DeliveryRequest(Supplier supplier, Product product, int productQuantity) {
        this.supplier = supplier;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
