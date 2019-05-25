package com.compare.numbers.service;

import com.compare.numbers.cache.CompareResultCache;
import com.compare.numbers.cache.Counter;
import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.entity.InputNumbersString;
import com.compare.numbers.utilites.ConvertUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

@Service
public class MaxNumberService implements CompareService {

    private CompareResultCache cache;
    private Counter counter;

    private final static Logger logger = LogManager.getLogger(MaxNumberService.class);

    @Autowired
    public MaxNumberService(CompareResultCache cache, Counter counter) {
        this.cache = cache;
        this.counter = counter;
    }

    @Override
    public synchronized CompareResult compareNumber(InputNumbersString inputNumbersString) {

        ArrayList<Integer> input = ConvertUtility.convertStringToInt(inputNumbersString.getStringNumbers());
        ComparableNumbers comparableNumbers = new ComparableNumbers(input);

        logger.info("Increment " + counter.increment());
        if (cache.checkComparableNumbers(comparableNumbers)) {
            logger.debug("CompareResult from cache.");
            return cache.findByComparableNumbers(comparableNumbers);
        } else {
            logger.debug("Calculate CompareResult");

            ArrayList<Integer> arrayComparableNumbers =  new ArrayList<>(comparableNumbers.getComparableNumbers());
            arrayComparableNumbers.sort(Collections.reverseOrder());
            Integer maximumNumber = arrayComparableNumbers.get(0);

            CompareResult compareResult = new CompareResult(maximumNumber);
            cache.addCompareResultToCache(comparableNumbers, compareResult);

            return compareResult;
        }
    }
}
