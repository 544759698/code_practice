package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/5
 */
public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        double left = 0;
        double right = x;
        while (right - left > 0.0000001) {
            double mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (int) right;
    }
}
