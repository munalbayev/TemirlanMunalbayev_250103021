package com.ecommerce;

public class OrderController {

    public static void main(String[] args) {
        CheckoutFacade checkout = new CheckoutFacade();

        String item = "Laptop-X1";
        String customer = "user_404";
        String address = "123 Main St";
        double price = 1200.00;

        System.out.println("Client initiating checkout via Facade...");
        boolean success = checkout.placeOrder(item, customer, address, price);

        if (success) {
            System.out.println("Client received: Order completed successfully!");
        } else {
            System.out.println("Client received: Order failed.");
        }
    }
}