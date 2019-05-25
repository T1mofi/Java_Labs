package com.compare.numbers.controller;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.InputNumbersString;
import com.compare.numbers.service.CompareService;
import com.compare.numbers.utilites.ConvertUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//http://localhost:8080//findMaxNumber?numbers=12,-13,5

@RestController
public class CompareController {
    private CompareService service;

    private final static Logger logger = LogManager.getLogger(CompareController.class);

    @Autowired
    public CompareController(@Qualifier("maxNumberService") CompareService service) {
        this.service = service;
    }

    @RequestMapping("/findMaxNumber")
    public ResponseEntity findMaxNumber(@RequestParam(value="numbers") String numbers) {
        try {
            logger.info("Input {" + numbers + "}");
            //ArrayList<Integer> input = ConvertUtility.convertStringToInt(numbers);
            //ComparableNumbers comparableNumbers = new ComparableNumbers(input);

            return ResponseEntity.ok(service.compareNumber(new InputNumbersString(numbers)));
        } catch (Exception exception) {
            logger.error("Bad params");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }
}
