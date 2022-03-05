package com.yang.practice.month202203.t07clonegraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/5
 */
public class T07CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        return cloneDfs(node, map);
    }

    public Node cloneDfs(Node node, HashMap<Node, Node> map) {
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node cloneNode = new Node(node.val, new ArrayList<>());
        map.put(node, cloneNode);
        for (Node n : node.neighbors) {
            cloneNode.neighbors.add(cloneDfs(n, map));
        }
        return cloneNode;
    }

    public static void main(String[] args) {
        System.out.println(111);
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
