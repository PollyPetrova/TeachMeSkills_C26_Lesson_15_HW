package com.teachmeskills.lesson15.task3;

import com.teachmeskills.lesson15.task3.exception.WrongLengthException;
import com.teachmeskills.lesson15.task3.service.Service;
import com.teachmeskills.lesson15.task3.validation.Validation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть возможно ошибок при получении размера коллекции с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */

public class Runner {

    public static void main(String[] args) {

        System.out.println("Enter the length of collection. It should be in range: [1,15]!");
        Scanner scanner=new Scanner(System.in);
        int number = 0;
        try {
            number= scanner.nextInt();
            Validation.valid(number);
        }catch (WrongLengthException e){
            System.out.println(e.getMessage());
            return;
        }catch (InputMismatchException m){
            System.out.println("You enter something except of number. Check what you enter and repeat operation!");
            return;
        }

        ArrayList<Integer> list=new ArrayList<>(number);
        Service.toCountAverageNumber(list, number);

    }

}
