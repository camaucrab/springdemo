package com.pdtdang.demospringboot.responsitories;

import org.springframework.data.repository.CrudRepository;

import com.pdtdang.demospringboot.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerResponsitory extends CrudRepository<Customer, Integer> {

    Optional<Customer> findById(Integer integer);

    List<Customer> findCustomerByFirstname(String firstname);

    List<Customer> findAll();

    long count();

    void delete(Customer entity);

    boolean existsById(Integer integer);

    Customer save(Customer entity);
}
