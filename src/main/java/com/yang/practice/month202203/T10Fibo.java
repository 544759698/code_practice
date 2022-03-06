package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/6
 */
public class T10Fibo {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (n <= 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i < n; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }
}
