package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/23
 */
public class MySqrt {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ret = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ret = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ret;
    }

    public int mySqrt1(int x) {
        double left = 0;
        double right = x;
        while (right - left > 0.000000001) {
            double mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return (int) right;
    }
}
