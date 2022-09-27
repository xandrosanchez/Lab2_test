package main.java.ru.miet.testing;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    @org.junit.jupiter.api.Test
    void sum() {
        CalculatorImpl calculator = new CalculatorImpl();
        double actual = calculator.sum(45,2);
        double expected = 47;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        CalculatorImpl calculator = new CalculatorImpl();
        double actual = calculator.subtract(45,2);
        double expected = 43;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        CalculatorImpl calculator = new CalculatorImpl();
        double actual = calculator.multiply(0,5);
        double expected = 0;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        CalculatorImpl calculator = new CalculatorImpl();
        double actual = calculator.divide(10,0);
        double expected = 5;
        assertEquals(expected,actual);
    }
}