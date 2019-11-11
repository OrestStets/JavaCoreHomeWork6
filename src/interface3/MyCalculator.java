package interface3;

import interface2.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public void plus() {
        int firstNumber = 40;
        int secondNumber = 78;
        int result =  firstNumber + secondNumber;

        System.out.println("Operation Plus = " + result );
    }

    @Override
    public void minus() {
        int firstNumber = 37;
        int secondNumber = 29;
        int result =  firstNumber - secondNumber;

        System.out.println("Operation Minus = " + result);
    }

    @Override
    public void multiply() {

        int firstNumber = 37;
        int secondNumber = 29;
        int result =  firstNumber * secondNumber;

        System.out.println("Operation Multiply = " + result);
    }

    @Override
    public void devide() {

        int firstNumber = 150;
        int secondNumber = 40;
        int result =  firstNumber / secondNumber;

        System.out.println("Operation Devide = " + result);

    }
}
