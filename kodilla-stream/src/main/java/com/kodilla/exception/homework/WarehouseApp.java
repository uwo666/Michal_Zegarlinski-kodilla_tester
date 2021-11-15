package com.kodilla.exception.homework;


import static com.kodilla.exception.homework.Warehouse.orders;

public class WarehouseApp {
    public static void main(String[] args) {
        orders.add(new Order("1"));
        orders.add(new Order("2"));
        orders.add(new Order("3"));
        orders.add(new Order("4"));
    }
}
