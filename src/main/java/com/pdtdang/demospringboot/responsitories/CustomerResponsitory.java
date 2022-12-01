package com.pdtdang.demospringboot.responsitories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pdtdang.demospringboot.entity.Customer;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerResponsitory extends CrudRepository<Customer, Integer> {

    Optional<Customer> findById(Integer integer);

    List<Customer> findCustomerByFirstname(String firstname);

    List<Customer> findAll();

//    long count();

//    void delete(Customer entity);

//    boolean existsById(Integer integer);

    Customer save(Customer entity);

    @Transactional
    @Modifying
    @Query(value = "update Customer c set c.firstname = ?1 where c.id = ?3", nativeQuery = true)
    int updateFirstnameById(String firstname, int id);


}
