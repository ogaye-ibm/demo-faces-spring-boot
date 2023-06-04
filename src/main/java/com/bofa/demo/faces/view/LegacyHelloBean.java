package com.bofa.demo.faces.view;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
public class LegacyHelloBean {
    private String name;
    private String message;

    public LegacyHelloBean() {
        System.out.println("  ***** LegacyHelloBean created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createMessage() {
        message = "Hello, " + name + "!";
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {

        return new java.util.Date().toString();

    }
}
