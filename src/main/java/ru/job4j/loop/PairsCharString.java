package ru.job4j.loop;

public class PairsCharString {
    public static boolean check(String l, String r) {
        boolean result = false;
        if (l.isEmpty() && r.isEmpty()) {
            result = true;
        } else if (l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PairsCharString.check("goga", "agog"));
        System.out.println(PairsCharString.check("", ""));
        System.out.println(PairsCharString.check("goga", "bibi"));
    }
}
