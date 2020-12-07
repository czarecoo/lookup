package com.example.demo.greeters;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleGreeter implements Greeter {
    public void greet() {
        System.out.println("Hello!");
    }
}