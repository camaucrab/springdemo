package com.pdtdang.demospringboot.controller;

import com.pdtdang.demospringboot.entity.Customer;
import com.pdtdang.demospringboot.services.CustomerService;
import com.pdtdang.demospringboot.ultis.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customer", produces="application/json")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/get-all-customers")
    public String getAllCustomer() {
        ResponseBean response = new ResponseBean();
        List<Customer> listCus = customerService.getAllCustomer();
        response.success(listCus);
        return response.toString();
    }

    @GetMapping(value = "/filter")
    public String filterCustomer(@RequestParam String firstname) {

        List<Customer> listCus = customerService.findCustomerByFirstName(firstname);

        ResponseBean response = new ResponseBean();
        response.success(listCus);
        return response.toString();
    }

    @GetMapping(value = "/get-customer")
    public String getCustomerById(@RequestParam int cusID) {

        Customer customer = customerService.findById(cusID);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);

        ResponseBean response = new ResponseBean();
        response.success(customers);
        return response.toString();
    }


    @PostMapping(value = "/create-customer")
    public ResponseBean createCustomer(@RequestBody Customer customer) {
        Customer resCustomer = customerService.saveCustomer(customer);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(resCustomer);

        ResponseBean response = new ResponseBean();
        response.success(customerList);
        return response;

    }
    @PutMapping(value="/update-customer")
    public ResponseBean updateCustomer(@RequestParam Customer customer) {

        Customer resCustomer = customerService.updateCustomer(customer);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(resCustomer);

        ResponseBean response = new ResponseBean();
        response.success(customerList);
        return response;
    }


}
