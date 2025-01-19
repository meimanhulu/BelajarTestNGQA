package com.testsqa;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculator {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int Modulo(int a, int b){
        return a % b;
    }

    public static double divided(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = a / b;
        
        decfor.setRoundingMode(RoundingMode.HALF_EVEN);
        return Double.parseDouble(decfor.format(result)); 
    }

    public static double bmi(double tinggi_meter, double berat_kg){
        if (tinggi_meter <= 0) {
            throw new IllegalArgumentException("Tinggi badan harus lebih besar dari 0");
        }
        double result = berat_kg / (tinggi_meter * tinggi_meter);
        
        decfor.setRoundingMode(RoundingMode.HALF_EVEN);
        return Double.parseDouble(decfor.format(result)); 
    }
}
