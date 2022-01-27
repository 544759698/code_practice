package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/27
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        double left = 0;
        double right = x;
        while ((right - left) > 0.00001) {
            double mid = left + (right - left) / 2.0;
            if (mid * mid > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (int) (left + right) / 2;
    }

    public static void main(String[] args) {
        Sqrt s = new Sqrt();
        System.out.println(s.mySqrt(9));
    }

}
