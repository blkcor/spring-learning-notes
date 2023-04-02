package com.chen.autowire.service;

import com.chen.autowire.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("UserService正在执行!!");
        userDao.addUser();
    }
}
