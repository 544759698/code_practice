package com.yang.practice.algorithm20200719;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/19
 */
public class SimpleWaitNotify {

    static final Object obj = new Object();

    public static class T1 extends Thread {
        @Override
        public void run() {
            synchronized(obj) {
                System.out.println(System.currentTimeMillis() + " T1 start!");
                try {
                    System.out.println(System.currentTimeMillis() + " T1 wait!");
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis() + " T1 end!");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            synchronized(obj) {
                System.out.println(System.currentTimeMillis() + " T2 start!");
                obj.notifyAll();
                System.out.println(System.currentTimeMillis() + " T2 end!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();
    }
}
