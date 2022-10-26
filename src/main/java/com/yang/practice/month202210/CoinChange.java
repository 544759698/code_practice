package com.yang.practice.month202210;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/26
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int ret = -1;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int tmp = memo[i - coins[j]];
                    if (tmp >= 0 && (ret == -1 || tmp + 1 < ret)) {
                        ret = tmp + 1;
                    }
                }
            }
            memo[i] = ret;
        }
        return memo[amount];
    }
}
