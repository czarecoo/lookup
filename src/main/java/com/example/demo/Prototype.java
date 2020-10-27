package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    private final int number;

    public Prototype(int number) {
        this.number = number;
    }

    public void doSomething() {
        System.out.println("Doing something " + number);
    }
}
