package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Расстояние между точками с координатами (0, 0) и (2, 0) равно " + result);
        result = Point.distance(2, 4, 6, 8);
        System.out.println("Расстояние между точками с координатами (2, 4) и (6, 8) равно " + result);
    }
}
