package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

        @Test
        public void whenDiapasonHasNot8ThenMinus1() {
            /*Дописать тест, когда элемент 8 в диапазоне не найден. Можно искать любой другой элемент, корректно отражая этот факт в названии теста.*/
            int[] data = new int[]{5, 2, 10, 2, 4};
            int el = 662;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            Assert.assertEquals(expected, result);
        }

    }