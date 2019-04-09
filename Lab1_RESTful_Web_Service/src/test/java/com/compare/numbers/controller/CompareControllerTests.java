/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.compare.numbers.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CompareControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test400() throws Exception {
        int status = mockMvc.perform(get("/findMaxNumber")
                .param("numbers","1,2,somethingText,4"))
                .andReturn().getResponse().getStatus();
        Assertions.assertThat(status).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    public void noParamCompareShouldReturnDefaultValue() throws Exception {

        this.mockMvc.perform(get("/findMaxNumber")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value("0"));

    }

    @Test
    public void paramCompareShouldReturnMaxNumber() throws Exception {

        this.mockMvc.perform(get("/findMaxNumber").param("numbers", "12,-13,5"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value("12"));
    }
}
