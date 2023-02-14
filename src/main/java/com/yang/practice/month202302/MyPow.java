package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/14
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        long p = n;
        if (n < 0) {
            x = 1 / x;
            p = -p;
        }
        double ret = 1;
        while (p > 0) {
            if (p % 2 == 1) {
                ret = ret * x;
                p = p - 1;
            } else {
                x = x * x;
                p = p / 2;
            }
        }
        return ret;
    }
}
