package com.teachmeskills.lesson15.task3.validation;

import com.teachmeskills.lesson15.task3.exception.WrongLengthException;

public class Validation {

    public static void valid(int number) throws WrongLengthException {
        if(number>=15 || number<=1){
            throw new WrongLengthException("Length of collection is out of bounds. Enter the number in range [1, 15]!");
        }
    }

}
