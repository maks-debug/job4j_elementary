package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenArray12345Then54321() {
        int[] arrayIn = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{5, 4, 3, 2, 1};
        int[] result = Turn.back(arrayIn);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArray2468Then8642() {
        int[] arrayIn = new int[]{2, 4, 6, 8};
        int[] expected = new int[]{8, 6, 4, 2};
        int[] result = Turn.back(arrayIn);
        Assert.assertArrayEquals(expected, result);
    }
}