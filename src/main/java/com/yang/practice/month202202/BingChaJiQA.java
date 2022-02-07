package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/7
 */
public class BingChaJiQA {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        BingChaJi b = new BingChaJi(n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < isConnected[i].length; j++) {
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
        this.parent = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    /**
     * 返回某个节点p的根节点，循环找
     *
     * @param p
     * @return
     */
    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    /***
     * 将p和q连接, 如果两个节点被连通，那么则让其中的一个根节点连接到另一个节点的根节点上
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            parent[rootP] = rootQ;
            count--;
        }
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return this.count;
    }

}
