package com.example;

public class Calculator {

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 5);
        System.out.println("The result of multiplying 10 and 5 is: " + result);
    }
}
