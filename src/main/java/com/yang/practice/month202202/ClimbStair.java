package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class ClimbStair {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
