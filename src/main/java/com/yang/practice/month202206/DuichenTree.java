package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/10
 */
public class DuichenTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkChildren(root.left, root.right);
    }

    public boolean checkChildren(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return checkChildren(left.left, right.right) && checkChildren(left.right, right.left);
    }

}
