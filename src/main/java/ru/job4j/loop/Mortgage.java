package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double duty = amount;
        while (duty > 0) {
            duty *= (100 + percent) * 0.01;
            duty -= salary;
            year++;
        }
        return year;
    }
}