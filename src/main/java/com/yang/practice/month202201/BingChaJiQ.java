package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/29
 */
public class BingChaJiQ {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        BingChaJi b = new BingChaJi(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    b.union(i, j);
                }
            }
        }
        return b.count();
    }

}

class BingChaJi {
    int count;
    int[] parent;

    public BingChaJi(int count) {
        this.count = count;
        parent = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        while (parent[p] != p) {
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        parent[rootP] = rootQ;
        count--;
    }

    public int count() {
        return count;
    }

}
