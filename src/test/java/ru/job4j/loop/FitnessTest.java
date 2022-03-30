package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void calcTest10Nik30() {
        int ivan = 10;
        int nik = 50;
        int expected = 3;
        int result = Fitness.calc(ivan, nik);

        Assert.assertEquals(expected, result);
    }
}