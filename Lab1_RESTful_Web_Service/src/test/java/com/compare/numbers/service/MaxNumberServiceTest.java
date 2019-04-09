package com.compare.numbers.service;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxNumberServiceTest {

    private MaxNumberService service = new MaxNumberService();


    @Test
    public void compareNumberTest() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 5, 3));

        ComparableNumbers numbers = new ComparableNumbers(array);

        CompareResult actual = service.compareNumber(numbers);
        CompareResult expected = new CompareResult(5);

        assertEquals(expected,actual);

    }
}