package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/26
 */
public class MirrorTree2 {
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
}
