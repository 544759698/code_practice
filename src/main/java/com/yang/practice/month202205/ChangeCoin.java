package com.yang.practice.month202205;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/17
 */
public class ChangeCoin {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            int ret = -1;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int tmp = memo[i - coins[j]];
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
