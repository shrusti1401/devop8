package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Test multiplying two positive numbers
        Assert.assertEquals(50, calculator.multiply(10, 5));

        // Test multiplying a positive and a negative number
        Assert.assertEquals(-15, calculator.multiply(3, -5));

        // Test multiplying two negative numbers
        Assert.assertEquals(25, calculator.multiply(-5, -5));

        // Test multiplying by zero
        Assert.assertEquals(0, calculator.multiply(0, 5));

        // Test multiplying large numbers
        Assert.assertEquals(1000000, calculator.multiply(1000, 1000));
    }
}

