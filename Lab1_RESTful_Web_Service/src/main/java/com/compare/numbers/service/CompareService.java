package com.compare.numbers.service;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;

import java.util.Collections;

public class CompareService {
    public static CompareResult getMaximumNumber(ComparableNumbers numbers) {

        Collections.sort(numbers.getComparableNumbers(),Collections.reverseOrder());
        int maximumNumber = numbers.getComparableNumbers().get(0);

        return new CompareResult(maximumNumber);
    }
}
