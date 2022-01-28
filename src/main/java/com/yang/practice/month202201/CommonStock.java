package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/28
 */
public class CommonStock {

    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        k = Math.min(2 * k, prices.length);
        int[][][] dp = new int[prices.length][2][k + 1];
        for (int i = 0; i <= k; i++) {
            dp[0][0][i] = 0;
            dp[0][1][i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][0][j] = Math.max(dp[i - 1][0][j], dp[i - 1][1][j - 1] + prices[i]);
                dp[i][1][j] = Math.max(dp[i - 1][0][j - 1] - prices[i], dp[i - 1][1][j]);
            }
        }
        return dp[prices.length - 1][0][k];
    }

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        CommonStock s = new CommonStock();
        System.out.println(s.maxProfit(2, prices));
    }

}
