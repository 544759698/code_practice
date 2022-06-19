package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/19
 */
public class MaxGiftValue {

    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] giftValues = new int[m][n];
        giftValues[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            giftValues[i][0] = giftValues[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            giftValues[0][i] = giftValues[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                giftValues[i][j] = Math.max(giftValues[i - 1][j], giftValues[i][j - 1]) + grid[i][j];
            }
        }
        return giftValues[m - 1][n - 1];
    }

}
