package com.pdtdang.demospringboot.services;

import com.pdtdang.demospringboot.entity.Customer;
import com.pdtdang.demospringboot.responsitories.CustomerResponsitory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = CustomerService.class)
//@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void evalue() {
        int sum = customerService.evaluate("3+2");
        assertEquals(5, sum);

        int sum2= customerService.evaluate("3");
        assertEquals(3, sum2);

    }
    @Test
    public void demo() {
        int res = customerService.demo(-1);
        assertEquals(0, res);

        int res2 = customerService.demo(5);
        assertEquals(1, res2);

    }

    @Test
    public void getAllCustomer() {
        System.out.printf("Testing Get All Customer: ", customerService.getAllCustomer());
        List<Customer> allCustomer = customerService.getAllCustomer();
        assertEquals(21, allCustomer.size());
    }

    @Test
    public void testCustomerServices () {
        Customer   customer = customerService.findById(2);
        customer.toString();
        customer.getId();
        customer.getFirstname();
        customer.getLastname();
        customer.toString();
        customer.getClass();
        customer.setFirstname("Changed First Name");
        customer.setLastname("Changed Last Name");
        customerService.updateCustomer(customer);

        Customer saveCustomer = customerService.saveCustomer(customer);
        List<Customer> listCustomers = customerService.findCustomerByFirstName("Changed First Name");
        System.out.println(saveCustomer);
        System.out.println(listCustomers);
    }


    @Test
    public void findById() {
        customerService.findCustomerByFirstName("");
        customerService.toString();
        customerService.getClass();
//        customerService.
    }

    @Test
    public void testUpdateCustomer() {
        Customer oldCus = customerService.findById(4);
        oldCus.setLastname("Updated Last Name");
        Customer newCus = customerService.updateCustomer(oldCus);
        assertEquals("Updated Last Name", newCus.getLastname());
    }
}