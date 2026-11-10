package com.ecommerce;

public class ShippingService {

    public void scheduleDelivery(String productId, String address) {
        System.out.println("[ShippingService] Step 1: Booking carrier for item: " + productId);
        System.out.println("[ShippingService] Step 2: Delivery scheduled to address: " + address);
    }
}