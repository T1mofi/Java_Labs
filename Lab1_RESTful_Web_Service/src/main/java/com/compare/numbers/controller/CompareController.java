package com.compare.numbers.controller;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.service.CompareService;
//mport com.compare.numbers.service.Config;
import com.compare.numbers.utilites.ConvertUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//http://localhost:8080//compareNumber?numbers=12,13,5

@RestController
public class CompareController {
    private CompareService service;

    @Autowired
    public CompareController(@Qualifier("compareServiceImpl2") CompareService service) {
        this.service = service;
    }

    @RequestMapping("/compareNumber")
    public CompareResult greeting(@RequestParam(value="numbers", defaultValue="0") String numbers) {

        ArrayList<Integer> input = ConvertUtility.convertStringToInt(numbers);

        ComparableNumbers comparableNumbers = new ComparableNumbers(input);
        return service.compareNumber(comparableNumbers);
    }
}
