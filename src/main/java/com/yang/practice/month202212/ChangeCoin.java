package com.yang.practice.month202212;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/12/7
 */
public class ChangeCoin {

    public int getMinCoinCount(int[] coins, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 1; i < target + 1; i++) {
            int result = -1;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int tmp = memo[i - coins[j]];
                    if (tmp != -1 && (result == -1 || tmp + 1 < result)) {
                        result = tmp + 1;
                    }
                }
            }
            memo[i] = result;
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
