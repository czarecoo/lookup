package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Service {
    public void doSomething(int i) {
        Prototype prototype = createPrototype(i);
        System.out.println(prototype);
        prototype.doSomething();
    }

    //cannot be private, static or final
    @Lookup
    Prototype createPrototype(int i) {
        throw new UnsupportedOperationException("Spring should override this lookup method");
    }
}