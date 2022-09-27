package main.java.ru.miet.testing;

public class CalculatorViewImpl implements CalculatorView{
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
