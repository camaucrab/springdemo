package com.pdtdang.demospringboot.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    CustomerController customerController;

//    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/customer/get-all-customer")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello, World")));
    }

}