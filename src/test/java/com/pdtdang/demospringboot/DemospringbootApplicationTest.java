package com.pdtdang.demospringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
public class DemospringbootApplicationTest {

    @Autowired
    DemospringbootApplication demospringbootApplication;

    @Test
    public void main() {

        demospringbootApplication.main(new String[] {});
    }
}