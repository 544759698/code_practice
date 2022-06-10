package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/10
 */
public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    public TreeNode mirrorTree1(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            mirrorTree1(root.left);
            mirrorTree1(root.right);
        }
        return root;
    }
}
