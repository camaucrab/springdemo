package com.pdtdang.demospringboot.services;

import io.cucumber.java.it.Data;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CustomerServiceTest {

    private final CustomerService customerService = new CustomerService();

    @Test
    public void evalue() {
        int sum = customerService.evaluate("1+2+3");
        assertEquals(6, sum);

    }
    @Test
    public void getAllCustomer() {
//        System.out.printf("Testing Get All Customer: ", customerService.getAllCustomer());

    }


}