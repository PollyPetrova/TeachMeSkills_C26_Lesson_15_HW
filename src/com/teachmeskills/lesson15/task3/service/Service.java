package com.teachmeskills.lesson15.task3.service;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    public static void toCountAverageNumber(ArrayList<Integer> list, int number){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter elements of array:");
        int sum=0;
        double avg=0;
        for (int i = 0; i < number; i++) {
            int listElement=scanner.nextInt();
            sum+= listElement;
        }
        System.out.print("Average number of array: ");
        avg= (double) sum /number;
        System.out.println(avg);
    }

}
