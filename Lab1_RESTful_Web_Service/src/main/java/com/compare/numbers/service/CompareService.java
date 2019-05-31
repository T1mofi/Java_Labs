package com.compare.numbers.service;

import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.entity.Input;
import org.springframework.stereotype.Service;

@Service
public interface CompareService {
    CompareResult compareNumber(Input input);
}
