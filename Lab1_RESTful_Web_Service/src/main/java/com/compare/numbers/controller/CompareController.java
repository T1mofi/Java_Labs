package com.compare.numbers.controller;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.service.CompareService;
import com.compare.numbers.utilites.ConvertUtility;
import com.sun.prism.shader.FillCircle_LinearGradient_PAD_AlphaTest_Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//http://localhost:8080//findMaxNumber?numbers=12,-13,5

@RestController
public class CompareController {
    private CompareService service;

    @Autowired
    public CompareController(@Qualifier("maxNumberService") CompareService service) {
        this.service = service;
    }

    @RequestMapping("/findMaxNumber")
    public ResponseEntity findMaxNumber(@RequestParam(value="numbers") String numbers) {
        try {
            ArrayList<Integer> input = ConvertUtility.convertStringToInt(numbers);
            ComparableNumbers comparableNumbers = new ComparableNumbers(input);

            return ResponseEntity.ok(service.compareNumber(comparableNumbers));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }
}
