package com.compare.numbers.controller;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.service.CompareService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//http://localhost:8080//compareNumber?number1=5&number2=3&number3=2

@RestController
public class CompareController {
    @RequestMapping("/compareNumber")
    public CompareResult greeting(@RequestParam(value="number1", defaultValue="0") int firstNumber,
                                  @RequestParam(value="number2", defaultValue="0") int secondNumber,
                                  @RequestParam(value="number3", defaultValue="0") int thirdNumber) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(firstNumber);
        input.add(secondNumber);
        input.add(thirdNumber);

        ComparableNumbers comparableNumbers = new ComparableNumbers(input);
        return CompareService.getMaximumNumber(comparableNumbers);
    }
}
