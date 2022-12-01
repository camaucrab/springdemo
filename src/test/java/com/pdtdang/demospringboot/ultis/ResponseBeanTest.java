package com.pdtdang.demospringboot.ultis;

import com.pdtdang.demospringboot.entity.Customer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ResponseBeanTest {


    private ResponseBean responseBean = new ResponseBean();

    @BeforeClass
    public static void beforeClass() throws Exception {
        ResponseBean responseBean = new ResponseBean();
    }


    @Test
    public void getCode() {
    }

    @Test
    public void setCode() {
    }

    @Test
    public void getMessage() {
    }

    @Test
    public void setMessage() {
    }

    @Test
    public void getData() {
    }

    @Test
    public void setData() {
    }

    @Test
    public void success() {
        List<Customer> listCustomer = new ArrayList<>();
        Customer customer = new Customer("PHUOC", "Dang");
        listCustomer.add(customer);
        responseBean.success(listCustomer);
        assertEquals(200, responseBean.getCode());
        assertEquals("Success", responseBean.getMessage());

        responseBean.setMessage("Meso thanh cong");
        responseBean.setCode(400);
        responseBean.setData(null);

        assertEquals(400, responseBean.getCode());
        assertEquals("Meso thanh cong", responseBean.getMessage());
        assertEquals(null, responseBean.getData());


    }

    @Test
    public void testToString() {
    }
}