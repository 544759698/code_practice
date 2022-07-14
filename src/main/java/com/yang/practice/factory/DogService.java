package com.yang.practice.factory;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/14
 */
public class DogService implements ISayHello {
    @Override
    public void sayHello() {
        System.out.println("Dog say hello");
    }
}
