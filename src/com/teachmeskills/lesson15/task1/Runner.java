package com.teachmeskills.lesson15.task1;

import com.teachmeskills.lesson15.task1.process.ToProcess;
import java.util.ArrayList;


/**
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * При заполнении коллекции числами с консоли следует делать приведения типа.
 * Код для привдения строки к числу можно использовать следующий:
 * 	int i = Integer.parseInt(str);
 * 	или
 * 	int val = Integer.valueOf(str);
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 * Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
 * https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
 * На экран вывести четные числа из коллекции.
 */

public class Runner {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("Enter elements: ");

        ToProcess.processing(list);

    }

}
