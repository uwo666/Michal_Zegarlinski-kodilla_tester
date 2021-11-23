package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuit {
    Shop shop = new Shop();
    Order order1 = new Order(500,"Andrew", LocalDate.of(2021,11,13));
    Order order2 = new Order(1000,"Matthew", LocalDate.of(2021,10,01));
    Order order3 = new Order(2000,"Scott", LocalDate.of(2021,10,29));

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToShop() {
        //When
        int numberOfOrder = shop.getSize();
        //then
        assertEquals(3, numberOfOrder);
    }

    @Test
    public void shouldGetOrdersBetweenDate() {
        //when
        Order result = shop.getorder(LocalDate.of(2021,10,01),
                LocalDate.of(2021,10,29));
        //then
       assertEquals(0, result);


    }

    @Test
    public void shouldGetOrdersMinAndMaxValue() {
        //when
        Order result = shop.valueRange(500, 2000);
        //then
        assertEquals(0, result);

    }

    @Test
    public void shouldGetSumOfOrders() {
        Order result = shop.valueSum();
        //then
        assertEquals(0, result);

    }
}