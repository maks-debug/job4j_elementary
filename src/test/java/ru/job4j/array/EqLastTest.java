package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEquals() {
        int[] left = new int[]{1, 2, 3, 4};
        int[] right = new int[]{10, 8, 6, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEquals() {
        int[] left = new int[]{1, 2, 3, 4};
        int[] right = new int[]{10, 8, 6, 2};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}