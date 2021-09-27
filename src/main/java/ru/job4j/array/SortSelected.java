package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int in = 0; in < data.length; in++) {
            int min = MinDiapason.findMin(data, in, data.length - 1);
            int index = FindLoop.indexOf(data, min, in, data.length - 1);
            data[index] = data[in];
            data[in] = min;
        }
        return data;
    }
}
