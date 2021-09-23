package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'p'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertFalse(result);
    }
}