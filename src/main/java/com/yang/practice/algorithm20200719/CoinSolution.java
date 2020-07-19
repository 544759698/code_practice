package com.yang.practice.algorithm20200719;

import java.util.Arrays;

/**
 * 硬币兑换，求最少硬币数 {1,2,5} 11 {4,5} 12
 *
 * @Author: yangguojun01
 * @Date: 2020/7/19
 */
public class CoinSolution {

    public int getMinCoins(int[] coins, int target) {
        if (coins == null || coins.length == 0 || target <= 0) {
            return -1;
        }
        int[] memos = new int[target + 1];
        // -2 no caculate -1 no solution
        Arrays.fill(memos, -2);
        memos[0] = 0;
        return getMemo(coins, target, memos);
    }

    public int getMemo(int[] coins, int target, int[] memos) {
        if (target > memos.length) {
            return -1;
        }
        if (memos[target] != -2) {
            return memos[target];
        }
        int result = -1;
        for (int coin : coins) {
            if (target >= coin) {
                int tmp = getMemo(coins, target - coin, memos);
                if (tmp > -1 && (result == -1 || result > tmp + 1)) {
                    result = tmp + 1;
                }
            }
        }
        return memos[target] = result;
    }

    public static void main(String[] args) {
        int[] coins = new int[] {1, 2, 5};
        CoinSolution solution = new CoinSolution();
        System.out.println(solution.getMinCoins(coins, 11));

    }

}
