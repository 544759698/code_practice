package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/26
 */
public class PrintMatrix {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ret = new int[m * n];
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[m][n];
        int directionIdx = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            ret[i] = matrix[row][col];
            visited[row][col] = true;
            int nextRow = row + directions[directionIdx][0];
            int nextCol = col + directions[directionIdx][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                directionIdx = (directionIdx + 1) % directions.length;
            }
            row = row + directions[directionIdx][0];
            col = col + directions[directionIdx][1];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PrintMatrix p = new PrintMatrix();
        int[] ret = p.spiralOrder(matrix);
        System.out.println(ret);
    }
}
