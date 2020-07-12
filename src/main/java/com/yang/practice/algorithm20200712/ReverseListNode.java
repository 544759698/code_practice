package com.yang.practice.algorithm20200712;

/**
 * @Author: yangguojun01
 * @Date: 2020/7/12
 */
class Node {
    int val;

    public Node(int val) {
        this.val = val;
    }

    Node next;
}

public class ReverseListNode {

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node pre = null;
        while (head != null) {
            Node tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        ReverseListNode reverseListNode = new ReverseListNode();
        Node ret = reverseListNode.reverse(node1);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }

}
