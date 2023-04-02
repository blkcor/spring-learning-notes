package com.chen.autowire.controller;

import com.chen.autowire.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("UserController正在执行!!");
        userService.addUser();
    }
}
