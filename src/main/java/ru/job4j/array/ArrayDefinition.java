package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[40];
        System.out.println("ages equals = " + ages.length);
        System.out.println("surnames equals = " + surnames.length);
        System.out.println("price equals = " + price.length);
    }
}
