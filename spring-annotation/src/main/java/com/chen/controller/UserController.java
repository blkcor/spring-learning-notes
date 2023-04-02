package com.chen.controller;


import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void addUser(){
        System.out.println("UserController正在执行!!");
        userService.addUser();
    }
}
