package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/29
 */
public class RobotMove {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    public int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if (i >= m || j >= n || sumNumBit(i) + sumNumBit(j) > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }

    public int sumNumBit(int num) {
        int ret = 0;
        while (num > 0) {
            ret = ret + num % 10;
            num = num / 10;
        }
        return ret;
    }

}
