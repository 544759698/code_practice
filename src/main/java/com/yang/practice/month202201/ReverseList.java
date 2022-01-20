package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/20
 */
public class ReverseList {

    public Node reverseList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node pre = null;
        Node curr = node;
        while (curr != null) {
            Node tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ReverseList r = new ReverseList();
        Node newHead = r.reverseList(node1);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
