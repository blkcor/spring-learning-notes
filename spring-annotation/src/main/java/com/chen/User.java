package com.chen;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    @Value("blkcor")
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
