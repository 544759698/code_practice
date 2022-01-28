package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/28
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 2; i < n; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }

}
