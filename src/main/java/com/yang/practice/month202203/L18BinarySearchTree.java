package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/13
 */
public class L18BinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }

    public boolean dfs(TreeNode root, TreeNode max, TreeNode min) {
        if (root == null) {
            return true;
        }
        if ((max != null && root.val >= max.val)
                || (min != null && root.val <= min.val)) {
            return false;
        }
        return dfs(root.left, root, min) && dfs(root.right, max, root);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        L18BinarySearchTree l = new L18BinarySearchTree();
        System.out.println(l.isValidBST(n1));
    }

}
