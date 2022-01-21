package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/22
 */
public class SwapTwoNode {

    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node dump = new Node(-1);
        dump.next = head;
        head = dump;
        while (head.next != null && head.next.next != null) {
            Node n1 = head.next;
            Node n2 = head.next.next;
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            head = n1;
        }
        return dump.next;
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
        SwapTwoNode s = new SwapTwoNode();
        Node newHead = s.swapPairs(node1);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

}
