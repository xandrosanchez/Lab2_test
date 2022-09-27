package main.java.ru.miet.testing;

public interface CalculatorView {

    void printResult(double result);

    void displayError(String message);

    String getFirstArgumentAsString(double firstArgument);

    String getSecondArgumentAsString(double secondArgument);
}
