package com.compare.numbers.controller;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.service.CompareService;
import com.compare.numbers.utilites.ConvertUtility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//http://localhost:8080//compareNumber?numbers=12,13,5

@RestController
public class CompareController {
    @RequestMapping("/compareNumber")
    public CompareResult greeting(@RequestParam(value="numbers", defaultValue="0") String numbers) {

        ArrayList<Integer> input = ConvertUtility.convertStringToInt(numbers);

        ComparableNumbers comparableNumbers = new ComparableNumbers(input);
        return CompareService.getMaximumNumber(comparableNumbers);
    }
}
