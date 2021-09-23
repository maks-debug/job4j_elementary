package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int in = 0; in < pref.length; in++) {
            if (word[in] != pref[in]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
