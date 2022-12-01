package com.pdtdang.demospringboot.controller;

import com.pdtdang.demospringboot.entity.Customer;
import com.pdtdang.demospringboot.services.CustomerService;
import com.pdtdang.demospringboot.ultis.ResponseBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerControllerTest {

    @Autowired
    CustomerController customerController;

    @Autowired
    CustomerService customerService;


    @Test
    public void testGetAllCustomer() {
        String customerList = customerController.getAllCustomer();
        System.out.println(customerList);

    }

    @Test
    public void getAllCustomer() {
        String response  = customerController.getAllCustomer();
    }

    @Test
    public void filterCustomer() {
        String response = customerController.filterCustomer("Phuoc");
    }

    @Test
    public void getCustomerById() {
        String response = customerController.getCustomerById(2);
    }

    @Test
    public void createCustomer() {
        Customer cus = new Customer("Phuoc", "Dang");
        ResponseBean response  = customerController.createCustomer(cus);

    }

    @Test
    public void updateCustomer() {
        Customer exitCus = customerService.findById(3);
        exitCus.setLastname("Update name customer 3");
        ResponseBean response  =  customerController.updateCustomer(exitCus);
        System.out.println(response);
    }
}