package com.chen.service;

import com.chen.autowire.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("UserService正在执行!!");
        userDao.addUser();
    }
}
