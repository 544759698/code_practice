package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/4
 */
public class KthInBst {

    int ret, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        this.ret = -1;
        inorder(root);
        return this.ret;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.right);
        if (this.k == 0) {
            return;
        }
        this.k--;
        if (this.k == 0) {
            this.ret = root.val;
            return;
        }
        inorder(root.left);
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
