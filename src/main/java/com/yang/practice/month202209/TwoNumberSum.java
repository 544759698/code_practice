package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/2
 */
public class TwoNumberSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(-1);
        ListNode dump = curr;
        boolean isAddOne = false;
        while (l1 != null && l2 != null) {
            curr.next = new ListNode((l1.val + l2.val + (isAddOne ? 1 : 0)) % 10);
            isAddOne = (l1.val + l2.val + (isAddOne ? 1 : 0)) / 10 > 0;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            curr.next = new ListNode((l1.val + (isAddOne ? 1 : 0)) % 10);
            isAddOne = (l1.val + (isAddOne ? 1 : 0)) / 10 > 0;
            curr = curr.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            curr.next = new ListNode((l2.val + (isAddOne ? 1 : 0)) % 10);
            isAddOne = (l2.val + (isAddOne ? 1 : 0)) / 10 > 0;
            curr = curr.next;
            l2 = l2.next;
        }
        if (isAddOne) {
            curr.next = new ListNode(1);
        }
        return dump.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
