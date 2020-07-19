package com.yang.practice.algorithm20200719;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/19
 */
public class ArrayListMultiThread {

    static List<Integer> data = new ArrayList<>();

    public static class AddThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                data.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        t1.start();
        Thread t2 = new Thread(new AddThread());
        t2.start();
        t1.join();
        t2.join();
        System.out.println(data.size());
    }
}
