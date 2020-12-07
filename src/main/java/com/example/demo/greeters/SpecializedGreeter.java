package com.example.demo.greeters;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpecializedGreeter implements Greeter {
    private String name;

    public SpecializedGreeter(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello " + name + "!");
    }
}