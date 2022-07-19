package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/19
 */
public class SellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
