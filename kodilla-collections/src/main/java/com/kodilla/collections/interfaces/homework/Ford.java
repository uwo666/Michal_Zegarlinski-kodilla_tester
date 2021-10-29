package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car{
    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        Random random = new Random();
        speed+=  random.nextInt(60);
        return speed;
    }

    @Override
    public void decreaseSpeed() {
        speed-=15;
    }
}
