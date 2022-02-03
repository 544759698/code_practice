package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/3
 */
public class OneCount {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
