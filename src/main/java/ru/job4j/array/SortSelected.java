package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            int index = -1;
            result[i] = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexInRange(data, result[i], i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }

        return result;
    }

}
