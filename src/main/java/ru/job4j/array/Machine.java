package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        int div10 = money / 10;
        int div5 = (money - div10 * 10) / 5;
        int div2 = (money - div10 * 10 - div5 * 5)  / 2;
        int div1 = money - div10 * 10 - div5 * 5 -  div2 * 2;
        for (int i = 0; i < div10; i++) {
            rsl[i] = 10;
            size++;
        }
        for (int i = 0; i < div5; i++) {
            rsl[size] = 5;
            size++;
        }
        for (int i = 0; i < div2; i++) {
            rsl[size] = 2;
            size++;
        }
        for (int i = 0; i < div1; i++) {
            rsl[size] = 1;
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}