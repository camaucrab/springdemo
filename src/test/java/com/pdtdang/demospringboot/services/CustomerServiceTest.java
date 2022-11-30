package com.pdtdang.demospringboot.services;

//it pimport org.junit.Test;
import com.pdtdang.demospringboot.entity.Customer;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceTest {

    @Mock
    @Autowired
    private CustomerService customerService;

    @Test
    public void getAllCustomer() {;
//        List<Customer> cust = customerService.getAllCustomer();


        List<String> listString = new ArrayList<>();
        listString.add("String");
        System.out.printf("Testing: ", listString);

    }


}