package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight180ThenWeight() {
        short in = 180;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        double delta = 0.01;
        Assert.assertEquals(expected, rsl, delta);

    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short in = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(in);
        double delta = 0.01;
        Assert.assertEquals(expected, rsl, delta);
    }
}