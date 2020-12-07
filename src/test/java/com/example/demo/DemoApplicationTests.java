package com.example.demo;

import com.example.demo.service.GreetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    GreetService greetService;

    @Test
    void contextLoads() {
        greetService.greet();
        greetService.greet("Czareg");
    }
}