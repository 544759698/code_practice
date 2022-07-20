package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/20
 */
public class SumNums {
    public int sumNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNums(n - 1);
    }
}
