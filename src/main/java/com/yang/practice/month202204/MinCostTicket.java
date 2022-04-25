package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/26
 */
public class MinCostTicket {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days[days.length - 1] + 1];
        int d = 0;
        for (int i = 1; i < dp.length; i++) {
            if (i != days[d]) {
                dp[i] = dp[i - 1];
            } else {
                int c1 = dp[i - 1] + costs[0];
                int c2 = (i > 7 ? dp[i - 7] : dp[0]) + costs[1];
                int c3 = (i > 30 ? dp[i - 30] : dp[0]) + costs[2];
                dp[i] = Math.min(Math.min(c1, c2), c3);
                d++;
            }
        }
        return dp[dp.length - 1];
    }
}
