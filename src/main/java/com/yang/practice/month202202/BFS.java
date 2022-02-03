package com.yang.practice.month202202;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/3
 */
public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode top = queue.poll();
                item.add(top.val);
                if (top.left != null) {
                    queue.offer(top.left);
                }
                if (top.right != null) {
                    queue.offer(top.right);
                }
                size--;
            }
            ret.add(item);
        }
        return ret;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
