package com.yang.practice.factory;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/14
 */
public class PrintMatrix {

    public void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionId = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            System.out.print(matrix[row][col] + " ");
            visited[row][col] = true;
            int nextRow = row + directions[directionId][0];
            int nextCol = col + directions[directionId][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                directionId = (directionId + 1) % directions.length;
            }
            row = row + directions[directionId][0];
            col = col + directions[directionId][1];
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PrintMatrix p = new PrintMatrix();
        p.printMatrix(matrix);
    }

}
