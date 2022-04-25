package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/25
 */
public class MySqrt1 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
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

    public static void main(String[] args) {
        MySqrt1 m = new MySqrt1();
        System.out.println(m.mySqrt(8));
    }
}
