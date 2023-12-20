package com.teachmeskills.lesson15.task1.process;

public class ForConversion {
    public static int convert(String str) {

        int val = 0;
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid String");
        }
        return val;

    }

}
