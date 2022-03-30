package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void check10() {
        int num = 10;
        boolean result = CheckPrimeNumber.check(10);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void check13() {
        int num = 13;
        boolean result = CheckPrimeNumber.check(10);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }
}