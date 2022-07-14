package com.yang.practice.factory;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/14
 */
public class Solution {

    public static void main(String[] args) {
        BeanFactory.getInstance().getService("dog").sayHello();
    }

}
