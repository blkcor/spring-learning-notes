package com.chen;

import java.util.Map;

/**
 * bean工厂 用来生产bean
 * 我们最核心的一个类，在它初始化的时候，创建了bean注册器，完成了资源的加载。
 * 获取bean的时候，先从单例缓存中取，如果没有取到，就创建并注册一个bean。
 */
public class BeanFactory {
    private final Map<String, BeanDefinition> beanDefinitionMap;
    private final BeanRegister beanRegister;

    public BeanFactory() throws ClassNotFoundException {
        //初始化bean的注册器
        beanRegister = new BeanRegister();
        //获取bean定义信息
        this.beanDefinitionMap = new ResourceLoader().getResource();
    }

    /**
     * 获取bean
     */
    public Object getBean(String beanName) {
        Object bean = beanRegister.getSingletonBean(beanName);
        if (bean != null) return bean;
        return createBean(beanDefinitionMap.get(beanName));
    }

    /**
     * 创建bean
     */
    public Object createBean(BeanDefinition beanDefinition) {
        try {
            //通过反射获取bean
            Object bean = beanDefinition.getBeanClass().getDeclaredConstructor().newInstance();
            //缓存单例bean
            beanRegister.registerSingletonBean(beanDefinition.getBeanName(), bean);
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
