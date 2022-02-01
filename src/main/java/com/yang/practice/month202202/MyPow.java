package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class MyPow {

    public double myPow_1(double x, int n) {
        double ret = 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        while (n > 0) {
            ret = ret * x;
            n--;
        }
        return ret;
    }

    public double myPow1(double x, int n) {
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }
        double ret = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                ret = ret * x;
                p = p - 1;
            } else {
                x = x * x;
                p = p / 2;
            }
        }
        return ret;
    }

    public double myPow(double x, int n) {
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }
        if (p == 0) {
            return 1;
        }
        if ((p & 1) == 1) {
            return x * myPow(x, (int) (p - 1));
        } else {
            return myPow(x * x, (int) (p / 2));
        }
    }

    public static void main(String[] args) {
        MyPow m = new MyPow();
        System.out.println(m.myPow(2, -10));
        //        System.out.println(m.myPow_1(2, 10));
    }

}
