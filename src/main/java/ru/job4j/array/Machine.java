package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        int[] coins = {10, 5, 2, 1};
        int sumCoins = 0;
        for (int coin:coins
             ) {
          while (money >= coin) {
              money -= coin;
              rsl[size] = coin;
              size++;
          }

        }
        return Arrays.copyOf(rsl, size);
    }
}