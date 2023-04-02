package com.chen;


import com.chen.autowire.controller.UserController;
import com.chen.ioc.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;


public class test {

    private Logger logger = LoggerFactory.getLogger(test.class);

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //通过id获取
        User user = applicationContext.getBean("user", User.class);
        System.out.println("6 对象创建完毕 可以使用!");
        applicationContext.close();
    }

    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.chen.ioc.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }

}
