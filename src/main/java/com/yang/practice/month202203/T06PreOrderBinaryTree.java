package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/5
 */
public class T06PreOrderBinaryTree {
    public List<Integer> preorderTraversal1(TreeNode root) {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Stack<Element> stack = new Stack<>();
        stack.push(new Element(root, 0));
        while (!stack.isEmpty()) {
            Element e = stack.pop();
            if (e.type == 1) {
                ret.add(e.node.val);
            } else {
                if (e.node.right != null) {
                    stack.push(new Element(e.node.right, 0));
                }
                if (e.node.left != null) {
                    stack.push(new Element(e.node.left, 0));
                }
                stack.push(new Element(e.node, 1));
            }
        }
        return ret;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Stack<Element> stack = new Stack<>();
        stack.push(new Element(root, 0));
        while (!stack.isEmpty()) {
            Element e = stack.pop();
            if (e.type == 1) {
                ret.add(e.node.val);
            } else {
                stack.push(new Element(e.node, 1));
                if (e.node.right != null) {
                    stack.push(new Element(e.node.right, 0));
                }
                if (e.node.left != null) {
                    stack.push(new Element(e.node.left, 0));
                }
            }
        }
        return ret;
    }

}

class Element {
    TreeNode node;
    // 0-in 1-out
    int type;

    public Element(TreeNode node, int type) {
        this.node = node;
        this.type = type;
    }
}
