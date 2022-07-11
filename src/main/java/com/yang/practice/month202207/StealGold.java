package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/11
 */
public class StealGold {
    public int getGold(int[] golds) {
        if (golds == null || golds.length == 0) {
            return 0;
        }
        int[] memo = new int[golds.length];
        memo[0] = golds[0];
        int max = memo[0];
        if (golds.length == 1) {
            return max;
        }
        memo[1] = Math.max(max, golds[1]);
        if (golds.length == 2) {
            return max;
        }
        for (int i = 2; i < golds.length; i++) {
            memo[i] = Math.max(memo[i - 2] + golds[i], memo[i - 1]);
            max = Math.max(max, memo[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        StealGold s = new StealGold();
        int[] houses = {3, 5, 2, 10};
        System.out.println(s.getGold(houses));
    }
}
