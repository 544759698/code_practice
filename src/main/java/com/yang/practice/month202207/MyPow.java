package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/23
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (x==0||x==1){
            return x;
        }
        long p = n;
        if (p<0){
            x=1.0/x;
            p = -p;
        }
        double ret =1.0;
        while (p>0){
            if (p%2==0){
                x = x*x;
                p = p/2;
            }else {
                ret = ret*x;
                p = p-1;
            }
        }
        return ret;
    }
}
