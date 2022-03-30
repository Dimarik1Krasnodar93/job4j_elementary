package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void calc() {
        int num = 5;
        int expected = 3;
        int result = PrimeNumber.calc(num);
        Assert.assertEquals(result, expected);
    }
}