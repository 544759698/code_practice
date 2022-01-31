package com.yang.practice.month202201;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/31
 */
public class WordSearch {

    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> ret = new HashSet<>();
        int m = board.length;
        int n = board[0].length;
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, trie, visited, i, j, "", ret);
            }
        }
        return new ArrayList<>(ret);
    }

    private void dfs(char[][] board, Trie trie, boolean[][] visited, int i, int j, String str, HashSet<String> ret) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        str = str + board[i][j];
        if (!trie.startsWith(str)) {
            return;
        }
        if (trie.search(str)) {
            ret.add(str);
        }
        visited[i][j] = true;
        dfs(board, trie, visited, i - 1, j, str, ret);
        dfs(board, trie, visited, i + 1, j, str, ret);
        dfs(board, trie, visited, i, j - 1, str, ret);
        dfs(board, trie, visited, i, j + 1, str, ret);
        visited[i][j] = false;
    }

}
