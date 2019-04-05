package com.compare.numbers.service;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CompareService {
    public CompareResult getMaximumNumber(ComparableNumbers numbers) {

        Collections.sort(numbers.getComparableNumbers(),Collections.reverseOrder());
        int maximumNumber = numbers.getComparableNumbers().get(0);

        return new CompareResult(maximumNumber);
    }
}
