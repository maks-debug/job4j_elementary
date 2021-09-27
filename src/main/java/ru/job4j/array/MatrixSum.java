package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int in = 0; in < array.length; in++) {
            for (int out = 0; out < array[in].length; out++) {
                result += array[in][out];
            }
        }
        return result;
    }
}
