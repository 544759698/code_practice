package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/3
 */
public class DeleteLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode newHead = pre;
        int i = 0;
        while (head != null) {
            i++;
            if (i > n) {
                pre = pre.next;
            }
            head = head.next;
        }
        pre.next = pre.next.next;
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        DeleteLastN d = new DeleteLastN();
        ListNode listNode = d.removeNthFromEnd(listNode1, 3);
        System.out.println(listNode.val);
    }

}
