package com.yang.practice.month202206;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/29
 */
public class CopyComplexList {

    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!map.containsKey(head)) {
            Node newNode = new Node(head.val);
            map.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
