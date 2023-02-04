package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/4
 */
public class Fibo {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int i = 3;
        int first = 1;
        int second = 2;
        while (i < n) {
            int tmp = second;
            second = (first + second) % 1000000007;
            first = tmp;
            i++;
        }
        return second;
    }
}
