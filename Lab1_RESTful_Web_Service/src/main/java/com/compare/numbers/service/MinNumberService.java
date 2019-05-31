package com.compare.numbers.service;

import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.entity.Input;
import org.springframework.stereotype.Service;

@Service
public class MinNumberService implements CompareService{
    @Override
    public CompareResult compareNumber(Input input) {
//        numbers.getComparableNumbers().sort(null);
//        int maximumNumber = numbers.getComparableNumbers().get(0);
//
//        return new CompareResult(maximumNumber);
        return new CompareResult(0);
    }
}
