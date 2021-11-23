package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getorder(LocalDate beginning, LocalDate end) {
        List<Order>getOrder =new ArrayList<>();
        orders.stream().filter(n->n.getOrderDate().isBefore(end))
                .filter(n->n.getOrderDate().isAfter(beginning))
                .collect(Collectors.toList());

        return null;
    }

    public Order valueRange(int minValue, int maxValue) {

        return null;

    }

    public int getSize() {
        return this.orders.size();
    }

    public Order valueSum(){
        orders.stream().map(n->n.getOrderValue())
                .mapToInt(n->n)
                .sum();
                return null;


    }
}
