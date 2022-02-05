package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/5
 */
public class BinarySearchTree1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTScope(root, null, null);
    }

    public boolean isValidBSTScope(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        return isValidBSTScope(root.left, min, root.val) && isValidBSTScope(root.right, root.val, max);
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
        BinarySearchTree1 b = new BinarySearchTree1();
        System.out.println(b.isValidBST(n1));
    }
}
