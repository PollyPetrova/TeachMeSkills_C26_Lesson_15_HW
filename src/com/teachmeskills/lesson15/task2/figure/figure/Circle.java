package com.teachmeskills.lesson15.task2.figure.figure;

import com.teachmeskills.lesson15.task2.figure.BaseFigure;

public class Circle extends BaseFigure {

    public int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateTheArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*r*2;
    }

}