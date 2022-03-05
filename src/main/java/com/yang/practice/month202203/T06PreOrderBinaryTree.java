package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/5
 */
public class T06PreOrderBinaryTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        dfs(root, ret);
        return ret;
    }

    private void dfs(TreeNode node, List<Integer> ret) {
        if (node == null) {
            return;
        }
        ret.add(node.val);
        dfs(node.left, ret);
        dfs(node.right, ret);
    }
}
