package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[40];
        String[] names = new String[4];
        names[0] = "Vasya Borovich";
        names[1] = "Stepanov Victor";
        names[2] = "Baggins Frodo";
        names[3] = "Saruman White";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        System.out.println();
        System.out.println("ages equals = " + ages.length);
        System.out.println("surnames equals = " + surnames.length);
        System.out.println("price equals = " + price.length);
    }
}
