package com.compare.numbers.service;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MaxNumberServiceTest {

    private MaxNumberService service = new MaxNumberService();


    @Test
    public void compareNumberTest() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(5);
        array.add(3);

        ComparableNumbers numbers = new ComparableNumbers(array);

        CompareResult actual = service.compareNumber(numbers);
        CompareResult expected = new CompareResult(5);

        assertEquals(expected,actual);

    }
}