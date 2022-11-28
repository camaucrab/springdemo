package com.pdtdang.demospringboot.services;

//import com.pdtdang.demospringboot.entity.Customer;
import com.fasterxml.jackson.core.JsonParser;
import com.pdtdang.demospringboot.modals.MCustomer;
//import com.pdtdang.demospringboot.responsitories.CustomerResponsitory;
import com.pdtdang.demospringboot.responsitories.MCustomerResponsitory;
import org.apache.tomcat.util.json.JSONParser;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private MCustomerResponsitory repo;
    public CustomerService() {
    }
    public long findById(int id) {

        MCustomer cus = new MCustomer("Phuoc", 2, "Machine");
        MCustomer cusResponse =  repo.save(cus);
        System.out.println(cusResponse.toString());

        long customer = repo.count();
        System.out.println(customer);
        return customer;
    }

//    public List<Customer>  findCustomerByFirstName(String firstname) {
//
//        List<Customer> customers = repo.findCustomerByFirstname(firstname);
//        return customers;
//    }
//    public List<Customer>  getAllCustomer() {
//        List<Customer> customer = repo.findAll();
//        return customer;
//    }
//
//    public Customer saveCustomer(Customer cus) {
//        Customer customer = repo.save(cus);
//        System.out.println("After Save: "+customer);
//        return customer;
//    }
//    public Customer updateCustomer(Customer cus) {
//        int cusID = repo.updateFirstnameById(cus.getFirstname(), cus.getId() );
//        System.out.println("After Save: "+cusID);
//        Optional<Customer> customer = repo.findById(cus.getId());
//        return customer.get();
//    }

}
