package com.pdtdang.demospringboot.services;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerServiceTest {

    @Test
    public void getAllCustomer() {;
        CustomerService customerService = new CustomerService();
        int sum = customerService.evaluate("1+2+3");
        assertEquals(6, sum);

    }


}