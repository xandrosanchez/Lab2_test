package main.java.ru.miet.testing;

import main.Exceptions.IncorrectInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CalculatorImpl implements Calculator, CalculatorPresenter, CalculatorView {

    private double firstArgument;
    private double secondArgument;


    public double getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(double secondArgument) throws IncorrectInputException {
        this.secondArgument = secondArgument;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(double firstArgument) {
        this.firstArgument = firstArgument;
    }

    public void startCalculator() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Write first number");
            setFirstArgument(Double.parseDouble(reader.readLine()));
            System.out.println("Write second number");
            setSecondArgument(Double.parseDouble(reader.readLine()));
            System.out.println("Write command: " + "+,-,*,/ ");
            String command = reader.readLine();
            double temp;
            switch (command) {
                case "+":
                    temp = sum(getFirstArgument(), getSecondArgument());
                    printResult(temp);
                    break;
                case "-":
                    temp = subtract(getFirstArgument(), getSecondArgument());
                    printResult(temp);
                    break;
                case "*":
                    temp = multiply(getFirstArgument(), getSecondArgument());
                    printResult(temp);
                    break;
                case "/":
                    try {
                        temp = divide(getFirstArgument(), getSecondArgument());
                        printResult(temp);
                    } catch (ArithmeticException e) {
                        displayError(Arrays.toString(e.getStackTrace()));
                    }
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if (b < Math.pow(10, -8)) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    @Override
    public void onPlusClicked() {
        System.out.println("You have chosen addition");
    }

    @Override
    public void onMinusClicked() {
        System.out.println("You have chosen subtraction");
    }

    @Override
    public void onDivideClicked() {
        System.out.println("You have chosen division");
    }

    @Override
    public void onMultiplyClicked() {
        System.out.println("You have chosen multiplication");
    }

    @Override
    public void printResult(double result) {
        System.out.println(result);
    }

    @Override
    public void displayError(String message) {
        System.out.println(message);
    }

    @Override
    public String getFirstArgumentAsString(double firstArgument) {
        return String.valueOf(firstArgument);
    }

    @Override
    public String getSecondArgumentAsString(double secondArgument) {
        return String.valueOf(secondArgument);
    }
}
