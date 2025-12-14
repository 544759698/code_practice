package com.yang.practice.month202307;

public class ListCircle {

    public static void main(String[] args) {

    }

    public boolean hasCircle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (slow == null || fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}

class Node {
    Node pre;
    Node next;
}
