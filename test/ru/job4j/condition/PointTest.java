package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double delta = 0.01;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, delta);
    }

    @Test
    public void when10To10Then0() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double expected = 0;
        double delta = 0.01;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, delta);
    }

    @Test
    public void when93To72ThenInt2Frac236() {
        int x1 = 9;
        int y1 = 3;
        int x2 = 7;
        int y2 = 2;
        double expected = 2.236;
        double delta = 0.001;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, delta);
    }
}