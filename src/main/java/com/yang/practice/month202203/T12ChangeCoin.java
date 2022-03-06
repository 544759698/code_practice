package com.yang.practice.month202203;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/6
 */
public class T12ChangeCoin {
    public int coinChange1(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, -1);
        minCoins[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int ret = -1;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    int tmp = minCoins[i - coin];
                    if (tmp >= 0 && (ret == -1 || (tmp + 1) < ret)) {
                        ret = tmp + 1;
                    }
                }
            }
            minCoins[i] = ret;
        }
        return minCoins[amount];
    }

    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2);
        memo[0] = 0;
        return getMemo(coins, amount, memo);
    }

    private int getMemo(int[] coins, int amount, int[] memo) {
        if (memo[amount] != -2) {
            return memo[amount];
        }
        int ret = -1;
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int tmp = getMemo(coins, amount - coin, memo);
                if (tmp >= 0 && (ret == -1 || tmp + 1 < ret)) {
                    ret = tmp + 1;
                }
            }
        }
        memo[amount] = ret;
        return memo[amount];
    }

}
