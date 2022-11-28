package com.pdtdang.demospringboot.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCustomerServiceTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown");
    }
    @Test
    void findById() {
        System.out.println("Testing");
    }

}