package com.yang.practice.day20220115;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/15
 */
public class StealGold {

    public int stealGold(int[] golds) {
        if (golds == null || golds.length == 0) {
            return 0;
        }
        if (golds.length == 1) {
            return golds[0];
        }
        if (golds.length == 2) {
            return Math.max(golds[0], golds[1]);
        }
        int[] memo = new int[golds.length];
        memo[0] = golds[0];
        memo[1] = Math.max(golds[0], golds[1]);
        for (int i = 2; i < golds.length; i++) {
            memo[i] = Math.max(memo[i - 2] + golds[i], memo[i - 1]);
        }
        return memo[golds.length - 1];
    }

    public static void main(String[] args) {
        int[] golds = {3, 5, 2, 10};
        StealGold s = new StealGold();
        System.out.println(s.stealGold(golds));
    }

}
