package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/29
 */
public class PreOrderTree {

    List<TreeNode> ret = new ArrayList<>();

    public List<TreeNode> preOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return ret;
        }
        ret.add(treeNode);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
        return ret;
    }

}

