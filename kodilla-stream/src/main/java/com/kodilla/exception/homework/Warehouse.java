package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
   public static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
       orders.add(order);
    }




}
