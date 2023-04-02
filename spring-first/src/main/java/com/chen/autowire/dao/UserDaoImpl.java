package com.chen.autowire.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDao正在执行!!");
    }
}
