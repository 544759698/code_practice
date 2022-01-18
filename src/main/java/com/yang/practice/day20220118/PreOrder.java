package com.yang.practice.day20220118;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/18
 */
public class PreOrder {

    public Node buildTree(int[] nums) {
        return innerBuildTree(nums, 0);
    }

    public void preOrderTree1(Node node, List<Integer> ret) {
        if (ret == null) {
            ret = new ArrayList<>();
        }
        if (node != null) {
            ret.add(node.value);
            preOrderTree1(node.left, ret);
            preOrderTree1(node.right, ret);
        }
    }

    public List<Integer> preOrderTree2(Node node) {
        List<Integer> ret = new ArrayList<>();
        if (node == null) {
            return ret;
        }
        Stack<Element> stack = new Stack<>();
        stack.push(new Element(0, node));
        while (!stack.isEmpty()) {
            Element e = stack.pop();
            if (e.type == 1) {
                ret.add(e.node.value);
            } else {
                if (e.node.right != null) {
                    stack.push(new Element(0, e.node.right));
                }
                if (e.node.left != null) {
                    stack.push(new Element(0, e.node.left));
                }
                if (e.node != null) {
                    stack.push(new Element(1, e.node));
                }
            }
        }
        return ret;
    }

    private Node innerBuildTree(int[] nums, int pos) {
        if (pos >= nums.length || nums[pos] == -1) {
            return null;
        }
        Node node = new Node(nums[pos]);
        node.left = innerBuildTree(nums, pos * 2 + 1);
        node.right = innerBuildTree(nums, pos * 2 + 2);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -1, 5, 6};
        PreOrder p = new PreOrder();
        Node node = p.buildTree(nums);
        //        List<Integer> ret = new ArrayList<>();
        //        p.preOrderTree1(node, ret);
        //        for (Integer i : ret) {
        //            System.out.println(i);
        //        }
        List<Integer> ret1 = p.preOrderTree2(node);
        for (Integer i : ret1) {
            System.out.println(i);
        }
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    class Element {
        // 0-push 1-output
        int type;
        Node node;

        public Element(int type, Node node) {
            this.type = type;
            this.node = node;
        }
    }

}
