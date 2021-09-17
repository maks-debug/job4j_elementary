package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int result = 0;
        for (int index = 0; index < left.length(); index++) {
            if (left.charAt(index) != right.charAt(index)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Hamming.checkStrings("12245", "12346"));
    }
}
