package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/14
 */
public class L22MyPow {
    public double myPow(double x, int n) {
        long l = n;
        if (x == 0) {
            return 0;
        }
        if (l < 0) {
            l = -l;
            x = 1.0 / x;
        }
        double ret = 1;
        while (l > 0) {
            if ((l & 1) == 0) {
                x = x * x;
                l = l >> 1;
            } else {
                ret = ret * x;
                l = l - 1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        L22MyPow l = new L22MyPow();
        System.out.println(l.myPow(2, 3));
    }

}
