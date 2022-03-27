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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        passed = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);

        float in3 = 4;
        float expected3 = 280;
        float out3 = Converter.euroToRuble(4);
        boolean passed3 = expected3 == out3;
        System.out.println("4 euro are 280 rubles. Test result : " + passed);

        float in4 = 5;
        float expected4 = 300;
        float out4 = Converter.euroToRuble(5);
        boolean passed4 = expected4 == out4;
        System.out.println("5 dollars are 300 rubles. Test result : " + passed);

    }
}
