package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        orders.stream().filter(u -> u.getNumber().equals(number))
               .forEach(un ->System.out.println( "your order is " + number));
        if (orders.contains(number))
            return orders.get(Integer.parseInt(number));
        throw new OrderDoesntExistException();

    }




}