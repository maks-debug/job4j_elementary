package ru.job4j.condition;

public class Types {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println("//1 выражение: " + b);

        float f = 123458.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("//2 выражение: " + rsl);

        char c = 49000;
        float in = c;
        System.out.println("//3 выражение: " + in);

        double d = 121.19;
        byte by = (byte) d;
        System.out.println("//4 выражение: " + by);

        short s = 1500;
        char ch = (char) s;
        double doub = ch;
        System.out.println("//5 выражение: " + ch + " и " + doub);
    }
}
