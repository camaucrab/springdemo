package com.pdtdang.demospringboot.entity;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
public class CustomerTest {

    @Test
    public void getFirstname() {
        Customer customer  = new Customer("PHUOC", "Thanh");
        String firstName = customer.getFirstname();
        assertEquals("PHUOC", firstName);
    }git 
}