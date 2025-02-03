package com.learningjava;

public class Calculator {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

     public int subtract(int number1, int number2) {
        return number1 - number2;
    }
}
