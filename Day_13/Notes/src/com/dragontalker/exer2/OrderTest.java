package com.dragontalker.exer2;

public class OrderTest {
}

class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Order) {
            Order order = (Order)obj;
            boolean sameId = this.orderId == order.orderId;
            boolean sameName = this.orderName.equals(order.orderName);
            return sameId && sameName;
        }

        return false;
    }
}
