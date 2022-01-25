package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/25
 */
public class MyPow {

    public double myPow(double x, int n) {
        // 防止n为负数时-n越界
        long ln = n;
        if (ln < 0) {
            return 1 / myPowInner(x, -ln);
        }
        return myPowInner(x, ln);
    }

    public double myPowInner(double x, long ln) {
        if (ln == 0) {
            return 1;
        }
        if ((ln & 1) == 1) {
            return x * myPowInner(x, ln - 1);
        } else {
            return myPowInner(x * x, ln / 2);
        }
    }

    public static void main(String[] args) {
        MyPow m = new MyPow();
        System.out.println(m.myPow(2, -5));
    }

}
