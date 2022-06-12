package com.yang.practice.month202206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/12
 */
public class SerializeTree {

    StringBuilder sb = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            sb.append("NULL,");
        } else {
            sb.append(root.val + ",");
            serialize(root.left);
            serialize(root.right);
        }
        return sb.substring(0, sb.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArr = data.split(",");
        TreeNode root = buildTree(new LinkedList<String>(Arrays.asList(dataArr)));
        return root;
    }

    public TreeNode buildTree(List<String> dataList) {
        if ("NULL".equals(dataList.get(0))) {
            dataList.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(dataList.get(0)));
        dataList.remove(0);
        root.left = buildTree(dataList);
        root.right = buildTree(dataList);
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        SerializeTree st = new SerializeTree();
        String str = st.serialize(n1);
        System.out.println(str);
        // 1,2,NULL,NULL,3,4,NULL,NULL,5,NULL,NULL
        TreeNode node = st.deserialize(str);
        System.out.println(node);
    }

}
