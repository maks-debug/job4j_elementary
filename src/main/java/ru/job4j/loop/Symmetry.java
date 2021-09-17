package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean result = true;
        String numberToString = Integer.toString(i);
        int out = numberToString.length() - 1;
        for (int index = 0; index <= out; index++, out--) {
            if (numberToString.charAt(index) != numberToString.charAt(out)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Symmetry.check(11211));
    }
}
