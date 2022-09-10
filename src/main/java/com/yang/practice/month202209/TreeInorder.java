package com.yang.practice.month202209;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/10
 */
public class TreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        inorder(root, ret);
        return ret;
    }

    public void inorder(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        inorder(root.left, ret);
        ret.add(root.val);
        inorder(root.right, ret);
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
