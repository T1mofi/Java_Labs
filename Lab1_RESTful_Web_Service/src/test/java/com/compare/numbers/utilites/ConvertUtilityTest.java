package com.compare.numbers.utilites;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConvertUtilityTest {
//    @Test   //(expected = NumberFormatException.class)
//    public void checkInvalidInput() {
//        assertEquals(0, ConvertUtility.convertStringToInt("asdfasfdsadf").size());
//    }

    @Test
    public void chechValidInput() {
        ArrayList<Integer> actualArray = ConvertUtility.convertStringToInt("2,5,3");
        ArrayList<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(2);
        expectedArray.add(5);
        expectedArray.add(3);

        assertEquals(expectedArray, actualArray);
    }
}