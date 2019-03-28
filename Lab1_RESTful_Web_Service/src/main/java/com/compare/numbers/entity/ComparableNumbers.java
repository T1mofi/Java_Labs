package com.compare.numbers.entity;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableNumbers {

    private ArrayList<Integer> comparableNumbers = new ArrayList<Integer>();

    public ComparableNumbers(ArrayList<Integer> comparableNumbers) {
        this.comparableNumbers = comparableNumbers;
    }

    public ArrayList<Integer> getComparableNumbers() {
        return comparableNumbers;
    }
}
