package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/2
 */
public class UglyNumber {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            int newP2 = dp[p2] * 2;
            int newP3 = dp[p3] * 3;
            int newP5 = dp[p5] * 5;
            dp[i] = Math.min(newP2, Math.min(newP3, newP5));
            if (dp[i] == newP2) {
                p2++;
            }
            if (dp[i] == newP3) {
                p3++;
            }
            if (dp[i] == newP5) {
                p5++;
            }
        }
        return dp[n - 1];
    }

}
