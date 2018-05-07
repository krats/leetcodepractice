package com.karthikbashetty.leetcodepractice;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode prev = null, next;
        while (current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;
        return current;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ans = reverseListRecursive(head.next);
        head.next = null;
        ListNode current = ans;
        while (current.next != null)
            current = current.next;
        current.next = head;
        return ans;
    }
}
