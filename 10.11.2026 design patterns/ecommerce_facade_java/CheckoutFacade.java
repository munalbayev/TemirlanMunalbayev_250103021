package com.ecommerce;

public class CheckoutFacade {

    private final InventoryService inventory;
    private final PaymentGateway payment;
    private final ShippingService shipping;
    private final NotificationService notification;

    public CheckoutFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentGateway();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
    }

    public boolean placeOrder(String productId, String customerId, String address, double amount) {
        System.out.println("=== [CheckoutFacade] Starting Order Placement Workflow ===");

        if (!inventory.checkStock(productId)) {
            System.out.println("[CheckoutFacade] Aborting: Item out of stock.");
            return false;
        }

        inventory.reserve(productId);

        if (!payment.charge(customerId, amount)) {
            System.out.println("[CheckoutFacade] Aborting: Payment declined.");
            return false;
        }

        shipping.scheduleDelivery(productId, address);

        notification.sendReceipt(customerId, amount);

        System.out.println("=== [CheckoutFacade] Order Workflow Completed Successfully ===");
        return true;
    }
}