package com.chen.ioc;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("blkcor");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
