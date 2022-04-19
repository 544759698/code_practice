package com.yang.practice.month202204;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/19
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int ret = -1;
            for (int coin : coins) {
                if (i >= coin) {
                    int tmp = memo[i - coin];
                    if (tmp != -1 && (ret == -1 || tmp + 1 < ret)) {
                        ret = tmp + 1;
                    }
                }
            }
            memo[i] = ret;
        }
        return memo[amount];
    }
}
