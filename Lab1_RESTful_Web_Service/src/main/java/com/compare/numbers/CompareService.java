package com.compare.numbers;

import java.util.Collections;

public class CompareService {
    public static CompareResult getMaximumNumber(ComparableNumbers numbers) {

        Collections.sort(numbers.getComparableNumbers(),Collections.reverseOrder());
        int maximumNumber = numbers.getComparableNumbers().get(0);

        return new CompareResult(maximumNumber);
    }
}
