package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/21
 */
public class L35Sqrt {

    public int mySqrt(int x) {
        double right = x;
        double left = 0;
        while (right - left > 0.0000001) {
            double mid = left + (right - left) / 2.0;
            if (mid * mid > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        L35Sqrt l = new L35Sqrt();
        System.out.println(l.mySqrt(5));
    }

}
