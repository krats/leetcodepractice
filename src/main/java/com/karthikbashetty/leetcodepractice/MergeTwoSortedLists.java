package com.karthikbashetty.leetcodepractice;

public class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        ListNode head = null;
        ListNode current = null;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(head == null) {
                    head = l1;
                    current = l1;
                } else {
                    current.next = l1;
                    current = current.next;
                }
                l1 = l1.next;
            } else {
                if(head == null) {
                    head = l2;
                    current = l2;
                } else {
                    current.next = l2;
                    current = current.next;
                }
                l2 = l2.next;
            }
        }
        if(l1 != null)
            current.next = l1;
        if(l2 != null)
            current.next = l2;
        return head;
    }
}
