package com.pdtdang.demospringboot.responsitories;

import com.pdtdang.demospringboot.modals.MCustomer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MCustomerResponsitory extends MongoRepository<MCustomer, String> {

    @Query("{name:'?0'}")
    MCustomer findItemByName(String name);
//
    @Query(value = "{category:'?0'}", fields = "{'name' : 1, 'quantity' : 1}")
    List<MCustomer> findAll(String category);

    public long count();

    @Override
    MCustomer save(MCustomer entity);
}
