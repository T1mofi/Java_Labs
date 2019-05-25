package com.compare.numbers.entity;

import java.util.Objects;

public class CompareResult {
    private final Integer number;

    public CompareResult(int number) {
        this.number = new Integer(number);
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompareResult that = (CompareResult) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
