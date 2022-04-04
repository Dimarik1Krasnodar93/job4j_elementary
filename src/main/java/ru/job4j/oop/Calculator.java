package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return  y - x;
    }

    public int div(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + div(y) + multiply(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(100);
        System.out.println(result);
        Calculator calc = new Calculator();
        result = calc.div(2100);
        System.out.println(result);
        result = calc.multiply(2);
        System.out.println(result);
        result = calc.sumAllOperation(210);
        System.out.println(result);
    }
}