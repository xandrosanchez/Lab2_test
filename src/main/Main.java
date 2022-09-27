package main;

import main.java.ru.miet.testing.CalculatorImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        while(true)
        {
            calculator.startCalculator();
        }
    }
}