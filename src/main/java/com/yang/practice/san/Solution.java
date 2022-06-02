package com.yang.practice.san;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class Solution {

    public static volatile int state = 0;

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
//        a.setDaemon(true);
//        b.setDaemon(true);
        a.start();
        b.start();
    }

}
