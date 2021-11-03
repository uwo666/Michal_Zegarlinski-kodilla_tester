package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Order (String orderNumber, String productName, double quantity){
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOrderNumber(){
        return orderNumber;
    }

    public String getProductName(){
        return productName;
    }

    public double getQuantity(){
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Order order = (Order) o;
        return Objects.equals(orderNumber, order.orderNumber)
                && Objects.equals(productName, order.productName)
                && Objects.equals(quantity, order.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
