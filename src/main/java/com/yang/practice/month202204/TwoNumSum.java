package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/13
 */
public class TwoNumSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(-1);
        ListNode dummy = curr;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum >= 10 ? 1 : 0;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
