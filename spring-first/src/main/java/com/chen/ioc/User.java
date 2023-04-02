package com.chen.ioc;


public class User {

    private String name;

    public User(){
        System.out.println("1 调用无参构造器创建对象!");
    }

    public void setName(String name) {
        System.out.println("2 给对象参数赋值!");
        this.name = name;
    }

    /**
     * 定义对象初始化指定方法
     */
    public void init() {
        System.out.println("4 初始化对象!");
    }

    /**
     * 定义对象销毁指定方法
     */
    public void destroy() {
        System.out.println("7 销毁对象!");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
