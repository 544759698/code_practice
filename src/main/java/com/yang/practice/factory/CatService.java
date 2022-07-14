package com.yang.practice.factory;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/14
 */
public class CatService implements ISayHello {
    @Override
    public void sayHello() {
        System.out.println("Cat say hello");
    }
}
