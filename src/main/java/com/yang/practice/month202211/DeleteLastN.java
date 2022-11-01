package com.yang.practice.month202211;

/**
 * @Author: yangguojun01
 * @Date: 2022/11/1
 */
public class DeleteLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dumpy = pre;
        int idx = 0;
        while (head != null) {
            if (idx >= n) {
                pre = pre.next;
            }
            head = head.next;
            idx++;
        }
        pre.next = pre.next == null ? null : pre.next.next;
        return dumpy.next;
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
