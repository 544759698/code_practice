package com.yang.practice.month202211;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/11/13
 */
public class TreeInOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        dfs(root, ret);
        return ret;
    }

    public void dfs(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        dfs(root.left, ret);
        ret.add(root.val);
        dfs(root.right, ret);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
