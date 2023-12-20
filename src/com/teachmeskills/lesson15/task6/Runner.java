package com.teachmeskills.lesson15.task6;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран.
 */

public class Runner {

    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("Polina");
        names.add("Lisa");
        names.add("Dmitriy");
        names.add("Mark");
        names.add("Ivan");
        names.add("Artur");
        names.add("Sergey");
        names.add("Daniil");
        names.add("Polina");
        names.add("Stepan");
        names.add("Fedor");

        System.out.println(names);

    }

}
