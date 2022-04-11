package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/11
 */
public class SellStockN {

    // 买卖股票，给一组价格，买卖一次
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    // 买卖股票，最简单的题，给一组价格，不限制买卖次数
    public int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

}
