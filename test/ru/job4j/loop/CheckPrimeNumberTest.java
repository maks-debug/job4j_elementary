package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when0() {
        int number = 0;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when13() {
        int number = 13;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when15() {
        int number = 15;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when3539() {
        int number = 3539;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }
}