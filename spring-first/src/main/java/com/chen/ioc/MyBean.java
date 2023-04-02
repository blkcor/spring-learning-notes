package com.chen.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//这个后置处理器 针对ioc容器中的所有bean都生效! 并不只是针对某一个bean!
public class MyBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 对象初始化前 调用后置处理器!");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 对象初始化后 调用后置处理器!");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
