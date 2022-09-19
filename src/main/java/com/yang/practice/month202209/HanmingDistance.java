package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/19
 */
public class HanmingDistance {
    public int hammingDistance(int x, int y) {
        int r = x ^ y;
        int n = 0;
        while (r != 0) {
            r = r & (r - 1);
            n++;
        }
        return n;
    }
}
