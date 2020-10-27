package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    Service service;

    @Test
    void contextLoads() {
        service.doSomething(1);
        service.doSomething(5);
    }
}