package com.yang.practice.san;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class ClassA extends Thread {
    @Override
    public void run() {
        System.out.println("ClassA run");
        Solution.state = 1;
        while (true) {
            if (Solution.state == 0) {
                System.out.println("state changed to 0");
                return;
            }
        }
    }
}
