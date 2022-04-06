package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

import javax.crypto.Mac;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max123() {
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int expected = 3;
        int result = Max.max(a1, a2, a3);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max243() {
        int a1 = 2;
        int a2 = 4;
        int a3 = 3;
        int expected = 4;
        int result = Max.max(a1, a2, a3);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max2435() {
        int a1 = 2;
        int a2 = 4;
        int a3 = 3;
        int a4 = 5;
        int expected = 5;
        int result = Max.max(a1, a2, a3, a4);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max9435() {
        int a1 = 9;
        int a2 = 4;
        int a3 = 3;
        int a4 = 5;
        int expected = 9;
        int result = Max.max(a1, a2, a3, a4);
        Assert.assertEquals(result, expected);
    }
}