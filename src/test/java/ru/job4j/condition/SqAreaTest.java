package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double delta = 0.01;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, delta);
    }

    @Test
    public void whenP10K23ThenSquareInt0Frac998263() {
        int p = 10;
        int k = 23;
        double expected = 0.998263;
        double delta = 0.000001;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, delta);
    }

    @Test
    public void whenP1K1ThenSquareInt0Frac06() {
        int p = 1;
        int k = 1;
        double delta = 0.001;
        double expected = 0.062;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, delta);
    }
}