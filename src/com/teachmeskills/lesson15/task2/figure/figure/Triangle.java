package com.teachmeskills.lesson15.task2.figure.figure;

import com.teachmeskills.lesson15.task2.figure.BaseFigure;

public class Triangle extends BaseFigure {

    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double calculateTheArea() {
        return Math.pow((calculatePerimeter()*(calculatePerimeter()-side1)*(calculatePerimeter()-side2)*
                (calculatePerimeter()-side3)), (double) 1/2);
    }


}