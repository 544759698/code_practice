package com.yang.practice.month202207;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/12
 */
public class ChangeCoin {
    public int getMinCoinCount(int[] coins, int target) {
        if (coins == null || coins.length == 0 || target <= 0) {
            return -1;
        }
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i < target + 1; i++) {
            int ret = -1;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    int tmp = memo[i - coin];
                    if (tmp != -1 && (ret == -1 || tmp + 1 < ret)) {
                        ret = tmp + 1;
                    }
                }
            }
            memo[i] = ret;
        }
        return memo[target];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3, 4};
        int target = 10;
        ChangeCoin s = new ChangeCoin();
        System.out.println(s.getMinCoinCount(coins, target));
        coins = new int[] {1, 5, 11};
        target = 20;
        System.out.println(s.getMinCoinCount(coins, target));
    }
}
