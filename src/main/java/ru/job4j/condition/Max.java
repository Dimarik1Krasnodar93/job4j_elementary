package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int a1, int a2, int a3) {
        return max(max(a1, a2), a3);
    }

    public static int max(int a1, int a2, int a3, int a4) {
        return max(max(a1, a2, a3), a4);
    }
}