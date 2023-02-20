package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/20
 */
public class SellStock121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }
        return profit;
    }
}
