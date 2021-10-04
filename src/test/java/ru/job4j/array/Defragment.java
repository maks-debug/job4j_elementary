package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int counter = index + 1; counter < array.length; counter++) {
                    if (array[counter] != null) {
                        String tmp = array[point];
                        array[point] = array[counter];
                        array[counter] = tmp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
