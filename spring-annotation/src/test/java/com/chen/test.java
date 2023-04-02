package com.chen;

import com.chen.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class test {
    @Test
    @Qualifier
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean(UserController.class);
        controller.addUser();
    }
}
