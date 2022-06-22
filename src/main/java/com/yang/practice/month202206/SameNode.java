package com.yang.practice.month202206;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/22
 */
public class SameNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while (headA != null) {
            s1.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            s2.push(headB);
            headB = headB.next;
        }
        ListNode ret = null;
        while (!s1.isEmpty() && !s2.isEmpty() && s1.peek() == s2.peek()) {
            ret = s1.peek();
            s1.pop();
            s2.pop();
        }
        return ret;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
