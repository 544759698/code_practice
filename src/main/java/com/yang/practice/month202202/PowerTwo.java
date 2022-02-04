package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/4
 */
public class PowerTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
