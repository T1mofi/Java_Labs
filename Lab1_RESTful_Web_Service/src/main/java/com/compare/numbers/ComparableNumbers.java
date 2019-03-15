package com.compare.numbers;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableNumbers {

    private ArrayList<Integer> comparableNumbers = new ArrayList<Integer>();

    public ComparableNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        comparableNumbers.add(firstNumber);
        comparableNumbers.add(secondNumber);
        comparableNumbers.add(thirdNumber);
    }

    public ArrayList<Integer> getComparableNumbers() {
        return comparableNumbers;
    }
}
