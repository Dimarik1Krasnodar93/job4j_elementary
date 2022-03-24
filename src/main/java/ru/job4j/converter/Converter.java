package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float usd = Converter.rubleToDollar(140);

        System.out.println("140 rubles are " + usd + " usd.");

        float rubFromUsd = Converter.dollarToRuble(50);
        System.out.println("50 usd are " + rubFromUsd + " rub");

        float rubFromEur = Converter.euroToRuble(100);
        System.out.println("100 eur are " + rubFromEur + " rub");

    }
}