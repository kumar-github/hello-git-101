package com.learningjava;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.go();
    }

    private void go() {
        // call the new code from here

        Calculator calculator = new Calculator();
        System.out.println(calculator.isEven(10));
        System.out.println(calculator.isEven(9));
        System.out.println(calculator.isOdd(10));
        System.out.println(calculator.isOdd(9));



    }
}
