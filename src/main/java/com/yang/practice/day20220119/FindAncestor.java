package com.yang.practice.day20220119;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/19
 */
public class FindAncestor {

    public int findAncestor(Node node, int val1, int val2) {
        if (node == null) {
            return -1;
        }
        if (node.val == val1 || node.val == val2) {
            return node.val;
        }
        int leftValue = findAncestor(node.left, val1, val2);
        int rightValue = findAncestor(node.right, val1, val2);
        if (leftValue > 0 && rightValue > 0) {
            return node.val;
        }
        return leftValue + rightValue + 1;
    }

    public Node buildTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return innerBuildTree(0, nums);
    }

    private Node innerBuildTree(int pos, int[] nums) {
        if (pos >= nums.length || nums[pos] == -1) {
            return null;
        }
        Node node = new Node(nums[pos]);
        node.left = innerBuildTree(pos * 2 + 1, nums);
        node.right = innerBuildTree(pos * 2 + 2, nums);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 4, 5, 6};
        FindAncestor f = new FindAncestor();
        Node node = f.buildTree(nums);
        System.out.println(f.findAncestor(node, 3, 6));
    }

}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}
