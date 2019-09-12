package com.javatpoint.beans;

import java.util.Objects;

public class Order {
    private int orderId;
    private int customerId;
    private int orderproductId;

    public Order() {}

    public Order(int orderId, int customerId, int orderproductId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderproductId = orderproductId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderproductId() {
        return orderproductId;
    }

    public void setOrderproductId(int orderproductId) {
        this.orderproductId = orderproductId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                customerId == order.customerId &&
                orderproductId == order.orderproductId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, orderproductId);
    }
}


