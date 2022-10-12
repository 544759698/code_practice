package com.yang.practice.month202210;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/11
 */
public class LowestAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
