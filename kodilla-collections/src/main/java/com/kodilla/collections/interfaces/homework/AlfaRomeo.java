package com.kodilla.collections.interfaces.homework;

public class AlfaRomeo implements Car{
   private int speed;

   public AlfaRomeo(int speed) {
       this.speed = speed;
   }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=20;


    }

    @Override
    public void decreaseSpeed() {
        speed -=10;
    }
}
