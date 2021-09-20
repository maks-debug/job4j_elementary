package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas6ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int element = 6;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = {5, 4, 3, 2};
        int element = 3;
        int result = FindLoop.indexOf(data, element);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}