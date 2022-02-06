package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/6
 */
public class CommonStock {
    public int maxProfit(int k, int[] prices) {
        if (k == 0 || prices == null || prices.length == 0) {
            return 0;
        }
        k = Math.min(2 * k, prices.length);
        int[][][] dp = new int[prices.length][2][k + 1];
        for (int i = 0; i <= k; i++) {
            dp[0][0][i] = 0;
            dp[0][1][i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int kTmp = 1; kTmp <= k; kTmp++) {
                dp[i][0][kTmp] = Math.max(dp[i - 1][1][kTmp - 1] + prices[i], dp[i - 1][0][kTmp]);
                dp[i][1][kTmp] = Math.max(dp[i - 1][0][kTmp - 1] - prices[i], dp[i - 1][1][kTmp]);
            }
        }
        return dp[prices.length - 1][0][k];
    }

    public static void main(String[] args) {
        int k = 2;
        int[] prices = {2, 4, 1};
        CommonStock c = new CommonStock();
        System.out.println(c.maxProfit(k, prices));
    }
}
