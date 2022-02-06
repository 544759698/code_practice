package com.yang.practice.month202202;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/5
 */
public class WordSearch {

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        HashSet<String> ret = new HashSet<>();
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, i, j, trie, "", ret);
            }
        }
        return new ArrayList<>(ret);
    }

    public boolean exist(char[][] board, String word) {
        Trie trie = new Trie();
        trie.insert(word);
        HashSet<String> ret = new HashSet<>();
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, i, j, trie, "", ret);
                if (ret.size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void dfs(char[][] board, boolean[][] visited, int i, int j, Trie trie, String currStr,
                    HashSet<String> ret) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        currStr += board[i][j];
        if (!trie.startsWith(currStr)) {
            return;
        }
        if (trie.search(currStr)) {
            ret.add(currStr);
        }
        visited[i][j] = true;
        dfs(board, visited, i - 1, j, trie, currStr, ret);
        dfs(board, visited, i + 1, j, trie, currStr, ret);
        dfs(board, visited, i, j - 1, trie, currStr, ret);
        dfs(board, visited, i, j + 1, trie, currStr, ret);
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        System.out.println(null + "a");
        System.out.println("" + "a");
    }

}
