package com.example.demo.service;

import com.example.demo.greeters.Greeter;
import com.example.demo.greeters.SimpleGreeter;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class GreetService {
    public void greet() {
        Greeter greeter = createSimpleGreeter();
        greeter.greet();
    }

    public void greet(String userName) {
        Greeter greeter = createSpecializedGreeterFor(userName);
        greeter.greet();
    }

    /**
     * 1. lookup method cannot be private, static or final and its class cannot be final
     * 2. lookup method parameters should match constructor parameters of desired class object
     * 3. everything inside method will be overwritten by spring so it does not really matter, but I have 2 suggestions:
     * a) if you want to test this class you should return new object of wanted class
     * b) if you do not want to test this class throw UnsupportedOperationException
     */
    @Lookup("specializedGreeter")
    Greeter createSpecializedGreeterFor(String userName) {
        throw new UnsupportedOperationException("Spring should override this lookup method");
    }

    @Lookup("simpleGreeter")
    Greeter createSimpleGreeter() {
        System.out.println("This should not be visible");
        return new SimpleGreeter();
    }
}