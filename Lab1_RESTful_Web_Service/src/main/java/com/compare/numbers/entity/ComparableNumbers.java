package com.compare.numbers.entity;

import java.util.ArrayList;
import java.util.Objects;

public class ComparableNumbers {
    private ArrayList<Integer> comparableNumbers;

    public ComparableNumbers(ArrayList<Integer> comparableNumbers) {
        this.comparableNumbers = comparableNumbers;
    }

    public ArrayList<Integer> getComparableNumbers() {
        return comparableNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparableNumbers numbers = (ComparableNumbers) o;
        return Objects.equals(comparableNumbers, numbers.comparableNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comparableNumbers);
    }
}
