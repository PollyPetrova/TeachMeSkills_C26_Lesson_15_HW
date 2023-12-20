package com.teachmeskills.lesson15.task1.process;

import java.util.ArrayList;
import java.util.Scanner;

public class ToProcess {

    public static void processing(ArrayList<Integer> list){

        while (true){
            Scanner scanner=new Scanner(System.in);
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                break;
            }

            int val= ForConversion.convert(str);
            list.add(val);
        }

        for (Integer val: list) {
            if (val %2==0){
                System.out.print(val+" ");
            }
        }
    }

}
