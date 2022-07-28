package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/28
 */
public class MatrixPath {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkPath(i, j, board, visited, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkPath(int i, int j, char[][] board, boolean[][] visited, int k, String word) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || k > word.length() - 1) {
            return false;
        }
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        if (board[i][j] == word.charAt(k) && k == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        if (checkPath(i + 1, j, board, visited, k + 1, word) || checkPath(i - 1, j, board, visited, k + 1, word)
                || checkPath(i, j + 1, board, visited, k + 1, word) || checkPath(i, j - 1, board, visited, k + 1,
                word)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        //        char[][] board = {{'a'}, {'a'}};
        //        String word = "aaa";
        MatrixPath mp = new MatrixPath();
        System.out.println(mp.exist(board, word));
    }

}
