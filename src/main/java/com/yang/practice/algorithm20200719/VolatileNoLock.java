package com.yang.practice.algorithm20200719;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/19
 */
public class VolatileNoLock {

    static volatile int i = 0;
    static volatile int m = 0;

    public static class PlusTask implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            for (int k = 0; k < 100000; k++) {
                i++;
                m++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            Thread t = new Thread(new PlusTask());
            t.start();
            // 这里实际是串行
            t.join();
        }
        System.out.println(m);
        Thread[] threads = new Thread[10];
        for (int j = 0; j < 10; j++) {
            threads[j] = new Thread(new PlusTask());
            threads[j].start();
        }
        for (int j = 0; j < 10; j++) {
            threads[j].join();
        }
        System.out.println(i);
    }

}
