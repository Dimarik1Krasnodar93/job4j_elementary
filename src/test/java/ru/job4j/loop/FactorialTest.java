package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int input = 5;
        int expected = 120;
        int result = Factorial.calc(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int input = 0;
        int expected = 1;
        int result = Factorial.calc(input);
        Assert.assertEquals(expected, result);
    }
}