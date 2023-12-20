package com.teachmeskills.lesson15.task2.figure.figure;

import com.teachmeskills.lesson15.task2.figure.BaseFigure;

public class Rectangle extends BaseFigure {

    public int width;
    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateTheArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+length);
    }

}