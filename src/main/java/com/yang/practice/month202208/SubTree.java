package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/3
 */
public class SubTree {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return checkTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean checkTree(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }
        return checkTree(a.left, b.left) && checkTree(a.right, b.right);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
