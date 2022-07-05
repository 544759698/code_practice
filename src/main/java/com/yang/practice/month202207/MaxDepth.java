package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/5
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}
