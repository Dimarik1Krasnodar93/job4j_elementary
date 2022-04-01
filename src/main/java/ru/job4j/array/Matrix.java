package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] result = new int[size][];

        for (int i = 0; i < size; i++) {
            result[i] = new int[size];
            for (int j = 0; j < size; j++) {
                result[i][j] =  (i + 1) * (j + 1);
            }

        }
        return  result;
    }
}
