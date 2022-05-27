package com.yang.practice.month202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/27
 */
public class SolutionDianxin {
    public static void main(String[] args) {

    }

    public static void printRightNode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode first = queue.poll();
                if (first.left != null) {
                    queue.add(first.left);
                }
                if (first.right != null) {
                    queue.add(first.right);
                }
                if (i == levelSize - 1) {
                    System.out.println(first);
                }
            }
        }
    }

}
