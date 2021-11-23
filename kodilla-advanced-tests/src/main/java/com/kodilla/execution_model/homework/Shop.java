package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getorder(LocalDate beginning, LocalDate end) {

        return null;
    }

    public Order valueRange(int minValue, int maxValue) {
        return null;

    }

    public int getSize() {
        return this.orders.size();
    }

    public Order valueSum(){
        return null;

    }
}
