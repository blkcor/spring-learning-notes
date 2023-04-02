package com.chen;

import java.util.HashMap;
import java.util.Map;

/**
 * 进行bean的注册
 */
public class BeanRegister {
    //单例bean缓存
    private Map<String, Object> singletonMap = new HashMap<>(32);

    /**
     * 获取单例bean
     */
    public Object getSingletonBean(String beanName) {
        return singletonMap.get(beanName);
    }

    /**
     * 注册单例bean
     */
    public void registerSingletonBean(String beanName, Object bean) {
        //缓存中存在 直接返回 不进行注册
        if (singletonMap.containsKey(beanName)) return;
        singletonMap.put(beanName, bean);
    }
}
