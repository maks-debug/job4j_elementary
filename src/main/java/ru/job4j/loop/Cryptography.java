package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder card = new StringBuilder(s);
        if (s.length() > 0 && s.length() <= 4) {
            return s;
        } else if (s.isEmpty()) {
            return "empty";
        }
        for (int index = 0; index < s.length() - 4; index++) {
            card.setCharAt(index, '#');
            s = card.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Cryptography.code(""));
    }
}