package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/19
 */
public class FindAncestor {

    public int findAncestor(TreeNode treeNode, int val1, int val2) {
        if (treeNode == null) {
            return -1;
        }
        if (treeNode.val == val1 || treeNode.val == val2) {
            return treeNode.val;
        }
        int leftValue = findAncestor(treeNode.left, val1, val2);
        int rightValue = findAncestor(treeNode.right, val1, val2);
        if (leftValue > 0 && rightValue > 0) {
            return treeNode.val;
        }
        return leftValue + rightValue + 1;
    }

    public TreeNode buildTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return innerBuildTree(0, nums);
    }

    private TreeNode innerBuildTree(int pos, int[] nums) {
        if (pos >= nums.length || nums[pos] == -1) {
            return null;
        }
        TreeNode treeNode = new TreeNode(nums[pos]);
        treeNode.left = innerBuildTree(pos * 2 + 1, nums);
        treeNode.right = innerBuildTree(pos * 2 + 2, nums);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 4, 5, 6};
        FindAncestor f = new FindAncestor();
        TreeNode treeNode = f.buildTree(nums);
        System.out.println(f.findAncestor(treeNode, 3, 6));
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
