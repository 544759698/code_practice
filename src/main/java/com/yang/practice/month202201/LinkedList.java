package com.yang.practice.month202201;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/22
 */
public class LinkedList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeN = new ListNode(-1);
        ListNode dumpy = beforeN;
        beforeN.next = head;
        int i = 0;
        while (head != null) {
            i++;
            if (i > n) {
                beforeN = beforeN.next;
            }
            head = head.next;
        }
        beforeN.next = beforeN.next.next;
        return dumpy.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 添加一个哨兵节点，省很多代码
        ListNode prev = new ListNode(-1);
        ListNode preHead = prev;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(4);
        n11.next = n12;
        n12.next = n13;
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(3);
        ListNode n23 = new ListNode(4);
        n21.next = n22;
        n22.next = n23;
        LinkedList l = new LinkedList();
        System.out.println(l.mergeTwoLists(n11, n21).val);
        System.out.println();
    }

}
