package com.yang.practice.month202210;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/19
 */
public class Fibo {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2])% 1000000007;;
        }
        return memo[n];
    }
}
