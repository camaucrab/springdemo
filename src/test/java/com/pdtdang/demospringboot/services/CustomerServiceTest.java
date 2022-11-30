package com.pdtdang.demospringboot.services;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceTest {

    @Mock
    private CustomerService customerService;

    @Test
    public void getAllCustomer() {
//        List<Customer> cust = customerService.getAllCustomer();
        List<String> listString = new ArrayList<>();
        listString.add("String");
        System.out.printf("Testing: ", listString);

    }


}