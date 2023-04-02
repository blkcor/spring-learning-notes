package com.chen;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * 资源加载 解析配置文件 这里为了简单起见 使用properties文件而不是xml文件
 */
public class ResourceLoader {
    public Map<String, BeanDefinition> getResource() throws ClassNotFoundException {
        Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>(16);
        Properties properties = new Properties();
        try {
            InputStream stream = ResourceLoader.class.getResourceAsStream("/bean.properties");
            properties.load(stream);
            Iterator<String> it = properties.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
                String className = properties.getProperty(key);
                BeanDefinition beanDefinition = new BeanDefinition();
                beanDefinition.setBeanName(key);
                Class clazz = Class.forName(className);
                beanDefinition.setBeanClass(clazz);
                beanDefinitionMap.put(key, beanDefinition);
            }
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return beanDefinitionMap;
    }
}
