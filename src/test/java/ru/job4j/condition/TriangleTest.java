package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenFirstLeg5SecondLeg10Hypotenuse10ThenTrue() {
        double firstLeg = 5;
        double secondLeg = 10;
        double hypotenuse = 10;
        boolean result = Triangle.exist(firstLeg, secondLeg, hypotenuse);
        Assert.assertTrue(result);

    }

    @Test
    public void whenFirstLeg5SecondLeg5Hypotenuse15ThenFalse() {
        double firstLeg = 5;
        double secondLeg = 5;
        double hypotenuse = 15;
        boolean result = Triangle.exist(firstLeg, secondLeg, hypotenuse);
        Assert.assertFalse(result);
    }
}