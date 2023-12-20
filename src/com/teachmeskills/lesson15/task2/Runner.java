package com.teachmeskills.lesson15.task2;

import com.teachmeskills.lesson15.task2.figure.BaseFigure;
import com.teachmeskills.lesson15.task2.figure.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.figure.Triangle;

import java.util.ArrayList;

/**
 * Создать коллекцию фигур.
 * (Классы для фигур можно взять из предыдущих домашних заданий. Использовать sealed классы не обязательно)
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */

public class Runner {

    public static void main(String[] args) {

        ArrayList<BaseFigure> figures=new ArrayList<>(5);

        figures.add(new Triangle(2, 5, 9));
        figures.add(new Triangle(15, 20, 25));
        figures.add(new Rectangle(7, 12));
        figures.add(new Rectangle(20, 18));
        figures.add(new Circle(25));

        int k=1;
        for (BaseFigure l:figures) {
            System.out.println("Information about "+k+" figure: ");
            System.out.println("Calculate perimeter= "+l.calculatePerimeter());
            System.out.println("Calculate area= "+l.calculateTheArea());
            System.out.println("----------------------------------------------");
            k++;
        }

    }

}
