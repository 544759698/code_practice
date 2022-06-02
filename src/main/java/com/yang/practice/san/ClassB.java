package com.yang.practice.san;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class ClassB extends Thread {
    @Override
    public void run() {
        System.out.println("ClassB run");
        while (true) {
            if (Solution.state == 1) {
                System.out.println("state changed to 1");
                Solution.state = 0;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
