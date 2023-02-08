package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/8
 */
public class MidNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
