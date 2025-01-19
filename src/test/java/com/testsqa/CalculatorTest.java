package com.testsqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void add() {
        int actualResult = Calculator.add(15, 35);
        int expectedResult = 50;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract() {
        int actualResult = Calculator.subtract(50, 30);
        int expectedResult = 20;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplication() {
        int actualResult = Calculator.multiplication(12, 5);
        int expectedResult = 60;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void Modulo() {
        int actualResult = Calculator.Modulo(35, 6);
        int expectedResult = 5;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divided() {
        double actualResult = Calculator.divided(15, 3);
        double expectedResult = 5.00;
        Assert.assertEquals(actualResult, expectedResult, 0.01);
    }

    @Test
    public void bmi() {
        double actualResult = Calculator.bmi(1.75, 70);
        double expectedResult = 22.86;
        Assert.assertEquals(actualResult, expectedResult, 0.01);
    }
}