package com.testsqa;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testsqa.games.MyGame;

public class CalculatorTest {

    @Test
    public void addTest() {
        int actualResult = MyGame.add(10, 20);
        int expectedResult = 30;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subTest() {
        int actualResult = Calculator.substract(10, 20);
        int expectedResult = -10;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
