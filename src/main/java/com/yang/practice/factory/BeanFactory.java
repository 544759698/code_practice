package com.yang.practice.factory;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/14
 */
public class BeanFactory {
    private static volatile BeanFactory beanFactory;
    private static HashMap<String, ISayHello> map = new HashMap<>();

    static {
        map.put("dog", new DogService());
        map.put("cat", new CatService());
    }

    public static BeanFactory getInstance() {
        if (beanFactory == null) {
            synchronized(BeanFactory.class) {
                if (beanFactory == null) {
                    beanFactory = new BeanFactory();
                }
            }
        }
        return beanFactory;
    }

    public ISayHello getService(String type) {
        // switch
        return map.get(type);
    }

}
