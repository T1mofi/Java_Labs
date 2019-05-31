package com.compare.numbers.service;

import com.compare.numbers.cache.CompareResultCache;
import com.compare.numbers.cache.Counter;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.entity.Input;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxNumberServiceTest {

    private CompareResultCache compareResultCache = new CompareResultCache();
    private Counter counter = new Counter();
    private MaxNumberService service = new MaxNumberService(compareResultCache, counter);

    @Test
    public void compareNumberTest() {

        Input input = new Input("2,5,3");

        CompareResult actual = service.compareNumber(input);
        CompareResult expected = new CompareResult(5);

        assertEquals(expected,actual);
    }
}