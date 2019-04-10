package com.compare.numbers.cache;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CompareResultCache {
    private Map<ComparableNumbers, CompareResult> cache  = new HashMap<>();

    public void addCompareResultToCache(ComparableNumbers comparableNumbers, CompareResult compareResult) {
        this.cache.put(comparableNumbers, compareResult);
    }

    public boolean checkComparableNumbers(ComparableNumbers comparableNumbers) {
        return this.cache.containsKey(comparableNumbers);
    }

    public CompareResult findByComparableNumbers(ComparableNumbers comparableNumbers) {
        return this.cache.get(comparableNumbers);
    }
}
