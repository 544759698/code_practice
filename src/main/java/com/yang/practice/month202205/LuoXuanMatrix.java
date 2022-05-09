package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/9
 */
public class LuoXuanMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int row = 0;
        int col = 0;
        int directionIdx = 0;
        int total = rows * cols;
        for (int i = 0; i < total; i++) {
            ret.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[directionIdx][0];
            int nextCol = col + directions[directionIdx][1];
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]) {
                directionIdx = (directionIdx + 1) % 4;
            }
            row = row + directions[directionIdx][0];
            col = col + directions[directionIdx][1];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        LuoXuanMatrix l = new LuoXuanMatrix();
        List<Integer> ret = l.spiralOrder(matrix);
        System.out.println(ret);
    }

}
