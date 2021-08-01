package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return k * Math.pow((p / (2 * (k + 1))), 2);
    }

    public static void main(String[] args) {
        System.out.println(SqArea.square(6, 2));
    }
}
