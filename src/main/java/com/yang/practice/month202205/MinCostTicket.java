package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/7
 */
public class MinCostTicket {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dpCosts = new int[days[days.length - 1] + 1];
        int daysIdx = 0;
        for (int i = 1; i < dpCosts.length; i++) {
            if (i != days[daysIdx]) {
                dpCosts[i] = dpCosts[i - 1];
            } else {
                int c1 = dpCosts[i - 1] + costs[0];
                int c2 = (i > 7 ? dpCosts[i - 7] : dpCosts[0]) + costs[1];
                int c3 = (i > 30 ? dpCosts[i - 30] : dpCosts[0]) + costs[2];
                dpCosts[i] = Math.min(c1, Math.min(c2, c3));
                daysIdx++;
            }
        }
        for (int i = 0; i < dpCosts.length; i++) {
            System.out.print(dpCosts[i] + " ");
        }
        System.out.println();
        return dpCosts[dpCosts.length - 1];
    }

    public static void main(String[] args) {
        int[] days =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        int[] costs = {2, 6, 15};
        MinCostTicket m = new MinCostTicket();
        System.out.println(m.mincostTickets(days, costs));
    }
}
