package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder abbreviation = new StringBuilder();
        char characterOfString;
        for (int index = 0; index < s.length(); index++) {
            characterOfString = s.charAt(index);
            if (Character.isUpperCase(characterOfString)) {
                abbreviation.append(characterOfString);
            }
        }
        return abbreviation.toString();
    }

    public static void main(String[] args) {
        System.out.println(Abbreviation.collect("North Atlantic Treaty Organization"));
    }
}
