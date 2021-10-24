package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        EquilateralTriangle surfaceArea = new EquilateralTriangle();
        int triangleSurfaceArea = surfaceArea.calcSurfaceArea();

        EquilateralTriangle perimeter = new EquilateralTriangle();
        int trianglePerimeter = perimeter.calcPerimeter();
        System.out.println("The surface area of the equilateral triangle is " + triangleSurfaceArea +
          " And the perimeter is " + trianglePerimeter);

    }
}
