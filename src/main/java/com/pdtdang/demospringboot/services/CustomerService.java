package com.pdtdang.demospringboot.services;

import com.pdtdang.demospringboot.entity.Customer;
import com.pdtdang.demospringboot.responsitories.CustomerResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerResponsitory repo;
    public CustomerService() {
    }
    public Customer findById(int id) {

        Optional<Customer> customer = repo.findById(id);
        System.out.println(customer.toString());
        return customer.get();
    }

    public List<Customer>  findCustomerByFirstName(String firstname) {

        List<Customer> customers = repo.findCustomerByFirstname(firstname);
        return customers;
    }
    public List<Customer>  getAllCustomer() {
        List<Customer> customer = repo.findAll();
        return customer;
    }

    public Customer saveCustomer(Customer cus) {
        Customer customer = repo.save(cus);
        System.out.println("After Save: "+customer);
        return customer;
    }
    public Customer updateCustomer(Customer cus) {
        int cusID = repo.updateFirstnameById(cus.getFirstname(), cus.getId() );
        System.out.println("After Save: "+cusID);
        Optional<Customer> customer = repo.findById(cus.getId());
        return customer.get();
    }

}
