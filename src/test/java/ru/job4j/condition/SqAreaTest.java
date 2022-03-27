package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K5Square1p10() {
        double expected = 1.10;
        int p = 6;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K10Square0p74() {
        double expected = 0.74;
        int p = 6;
        double k = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K20Square0p01() {
        double expected = 0.01;
        int p = 1;
        double k = 20;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}