package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/5
 */
public class T06PreOrderMultiTree {
    public List<Integer> preorder(Node root) {
        List<Integer> ret = new ArrayList<>();
        dfs(root, ret);
        return ret;
    }

    public void dfs(Node node, List<Integer> ret) {
        if (node == null) {
            return;
        }
        ret.add(node.val);
        if (node.children == null || node.children.size() == 0) {
            return;
        }
        int i = 0;
        while (i < node.children.size()) {
            dfs(node.children.get(i), ret);
            i++;
        }

    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
