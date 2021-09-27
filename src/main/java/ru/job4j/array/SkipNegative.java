package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int in = 0; in < array.length; in++) {
            for (int out = 0; out < array[in].length; out++) {
                if (array[in][out] < 0) {
                    array[in][out] = 0;
                }
            }
        }
        return array;
    }
}
