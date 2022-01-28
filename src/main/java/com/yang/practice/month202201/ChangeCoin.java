package com.yang.practice.month202201;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/28
 */
public class ChangeCoin {

    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int result = -1;
            for (int coin : coins) {
                if ((i - coin) >= 0) {
                    int tmp = memo[i - coin];
                    if (tmp != -1 && (result == -1 || tmp + 1 < result)) {
                        result = tmp + 1;
                    }
                }
            }
            memo[i] = result;
        }
        return memo[amount];
    }

}
