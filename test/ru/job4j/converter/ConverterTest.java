package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140f;
        float expected = 2;
        float out1 = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out1, eps);
    }

    @Test
    public void whenConverter180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}