package com.yang.practice.month202202;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class ChangeCoin {

    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int sum = 1; sum <= amount; sum++) {
            int ret = -1;
            for (int coin : coins) {
                if (sum - coin >= 0) {
                    int tmp = memo[sum - coin];
                    if (tmp != -1 && (ret == -1 || (tmp + 1) < ret)) {
                        ret = tmp + 1;
                    }
                }
            }
            memo[sum] = ret;
        }
        return memo[amount];
    }

}
