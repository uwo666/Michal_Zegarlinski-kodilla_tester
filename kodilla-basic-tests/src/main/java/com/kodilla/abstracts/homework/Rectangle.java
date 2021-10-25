package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle() {
        super(2, 5);
    }

    @Override
    public int calcSurfaceArea() {
       int result = getBase() * getHeight();
        return result;
    }

    @Override
    public int calcPerimeter() {
        return 0;
    }


}
