package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = h * l;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(SqArea.square(6, 2));
    }
}
