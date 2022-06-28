package com.yang.practice.month202206;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/28
 */
public class TreePathSum {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        traceback(queue, ret, root, target);
        return ret;
    }

    public void traceback(Deque<Integer> queue, List<List<Integer>> ret, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target = target - root.val;
        queue.offer(root.val);
        if (root.left == null && root.right == null && target == 0) {
            ret.add(new ArrayList<>(queue));
        }
        traceback(queue, ret, root.left, target);
        traceback(queue, ret, root.right, target);
        queue.pollLast();
    }

    public static void main(String[] args) {
        TreePathSum t = new TreePathSum();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;
        List<List<Integer>> ret = t.pathSum(n1, 3);
        System.out.println(ret);
    }

}
