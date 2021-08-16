package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenFirst5AndSecond10ThenSecond10() {
        int first = 5;
        int second = 10;
        int expected = 10;
        int result = Max.maxNumber(5, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirst10AndSecond5ThenFirst10() {
        int first = 10;
        int second = 5;
        int expected = 10;
        int result = Max.maxNumber(10, 5);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirst2EqualSecond2ThenAnyNumber2() {
        int first = 2;
        int second = 2;
        int expected = 2;
        int result = Max.maxNumber(2, 2);
        Assert.assertEquals(expected, result);
    }
}