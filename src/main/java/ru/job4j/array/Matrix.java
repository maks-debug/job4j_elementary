package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int in = 0; in < size; in++) {
            for (int out = 0; out < size; out++) {
                array[in][out] = (in + 1) * (out + 1);
            }
        }
        return array;
    }
}
