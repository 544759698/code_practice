package com.yang.practice.month202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/27
 */
public class Solution2 {
    public static void main(String[] args) {

    }

    public static void printRightNode(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node first = queue.poll();
                if (first.getLeft() != null) {
                    queue.add(first.getLeft());
                }
                if (first.getRight() != null) {
                    queue.add(first.getRight());
                }
                if (i == levelSize - 1) {
                    System.out.println(first);
                }
            }
        }
    }

}

class Node {
    private int val;
    private Node left;
    private Node right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
