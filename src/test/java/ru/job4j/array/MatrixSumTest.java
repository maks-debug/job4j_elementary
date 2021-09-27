package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingleArray() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwoArrays() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThreeArrays() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}