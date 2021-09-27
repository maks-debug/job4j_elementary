package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenArrayEqual3ThenSort() {
        int[] array = new int[]{7, 2, 1};
        int[] result = SortSelected.sort(array);
        int[] expected = new int[]{1, 2, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayEqual5ThenSort() {
        int[] array = new int[]{3, 4, 7, 2, 1};
        int[] result = SortSelected.sort(array);
        int[] expected = new int[]{1, 2, 3, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayEqual10ThenSort() {
        int[] array = new int[]{3, 4, 7, 2, 6, 1, 10, 9, 5, 8};
        int[] result = SortSelected.sort(array);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}