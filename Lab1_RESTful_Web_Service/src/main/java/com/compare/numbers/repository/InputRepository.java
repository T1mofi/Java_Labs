package com.compare.numbers.repository;

import com.compare.numbers.entity.Input;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputRepository extends CrudRepository<Input, Integer> {

    Input findByParams(String params);
}