package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/13
 */
public class L19Ancestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val == root.val || q.val == root.val) {
            return root;
        }
        TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);
        if (leftAncestor != null && rightAncestor != null) {
            return root;
        }
        return leftAncestor != null ? leftAncestor : rightAncestor;
    }
}
