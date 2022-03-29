package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void sumByEvenStart1Finish10Result30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenStart3Finish10Result28() {
        int start = 3;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        Assert.assertEquals(expected, result);
    }
}