package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/14
 */
public class L25SellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public int maxProfit1(int[] prices) {
        int profit = 0;
        int currMinPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < currMinPrice) {
                currMinPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - currMinPrice);
            }
        }
        return profit;
    }
}
