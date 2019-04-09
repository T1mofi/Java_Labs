package com.compare.numbers.utilites;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ConvertUtilityTest {

    @Test
    public void checkValidInput() {
        ArrayList<Integer> actualArray = ConvertUtility.convertStringToInt("2,5,3");
        ArrayList<Integer> expectedArray = new ArrayList<Integer>(Arrays.asList(2, 5, 3));

        assertEquals(expectedArray, actualArray);
    }

    @Test
    public void checkOtherParamOrder() {
        ArrayList<Integer> actualArray = ConvertUtility.convertStringToInt("3,5,2");
        ArrayList<Integer> expectedArray = new ArrayList<Integer>(Arrays.asList(2, 5, 3));

        assertNotEquals(expectedArray, actualArray);
    }
}