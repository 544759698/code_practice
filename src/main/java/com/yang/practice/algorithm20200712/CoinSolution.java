package com.yang.practice.algorithm20200712;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/12
 */
public class CoinSolution {

    public int getCoins(int[] coins, int target) {
        if (coins == null || coins.length == 0 || target <= 0) {
            return -1;
        }
        int[] memo = new int[target + 1];
        for (int sum = 1; sum <= target; sum++) {
            int result = -1;
            for (int coin : coins) {
                if (sum == coin || (sum - coin > 0 && memo[sum - coin] > 0)) {
                    int tmp = memo[sum - coin] + 1;
                    if (result == -1 || tmp < result) {
                        result = tmp;
                    }
                }
            }
            memo[sum] = result;
        }
        return memo[target];
    }

    public static void main(String[] args) {
        CoinSolution solution = new CoinSolution();
        System.out.println(solution.getCoins(new int[] {1, 2, 3, 4}, 10));
        System.out.println(solution.getCoins(new int[] {1, 5, 11}, 20));
    }

}
