package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/26
 */
public class SellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

}
