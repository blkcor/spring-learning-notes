package com.chen;


import com.chen.config.SpringAutoConfiguration;
import com.chen.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(SpringAutoConfiguration.class);
        UserController userController = context.getBean(UserController.class);
        userController.addUser();
    }
}
