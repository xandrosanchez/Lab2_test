package main.java.ru.miet.testing;

public class CalculatorPresenterImpl implements CalculatorPresenter{
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
}
