package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/28
 */
public class SellStock122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
