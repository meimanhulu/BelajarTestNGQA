package com.testsqa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testsqa.games.MyGame;

public class CalculatorTest {

    // @Test
    // public void add() {
    //     int actualResult = Calculator.add(15, 35);
    //     int expectedResult = 50;
    //     Assert.assertEquals(actualResult, expectedResult);
    // }

    // @Test
    // public void subtract() {
    //     int actualResult = Calculator.subtract(50, 30);
    //     int expectedResult = 20;
    //     Assert.assertEquals(actualResult, expectedResult);
    // }

    // @Test
    // public void multiplication() {
    //     int actualResult = Calculator.multiplication(12, 5);
    //     int expectedResult = 60;
    //     Assert.assertEquals(actualResult, expectedResult);
    // }

    // @Test
    // public void Modulo() {
    //     int actualResult = Calculator.Modulo(35, 6);
    //     int expectedResult = 5;
    //     Assert.assertEquals(actualResult, expectedResult);
    // }

    // @Test
    // public void divided() {
    //     double actualResult = Calculator.divided(15, 3);
    //     double expectedResult = 5.00;
    //     Assert.assertEquals(actualResult, expectedResult, 0.01);
    // }

    // @Test
    // public void bmi() {
    //     double actualResult = Calculator.bmi(1.75, 70);
    //     double expectedResult = 22.86;
    //     Assert.assertEquals(actualResult, expectedResult, 0.01);
    // }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after Method");
    }
    @Test
    public void addTest() {
        System.out.println("addTest Method");
        int actualResult = MyGame.add(10, 20);
        int expectedResult = 3000;

        Assert.assertEquals(actualResult, expectedResult, "Gagal test add");
    }

    @Test
    public void subTest() {
        System.out.println("subTest Method");
        int actualResult = Calculator.subtract(10, 20);
        int expectedResult = -10;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test03() {
        System.out.println("test03 Method");
        Assert.assertTrue(7 > 8, "Gagal di test 03");
    }

    @Test
    public void test04() {
        System.out.println("test04 Method");
        String[] choice = {"Pendidikan"};
        String[] actual = {"Pendidikan"};
        Assert.assertEqualsNoOrder(choice, actual, "Gagal di test 04");
    }



}
