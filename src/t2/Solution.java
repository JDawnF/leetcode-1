package t2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode p = h;
        int temp = 0;
        while (l1 != null && l2 != null) {
            p.next = new ListNode((temp + l1.val + l2.val) % 10);
            temp = (temp + l1.val + l2.val) / 10;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            p.next = new ListNode((temp + l1.val) % 10);
            temp = (temp + l1.val) / 10;
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            p.next = new ListNode((temp + l2.val) % 10);
            temp = (temp + l2.val) / 10;
            p = p.next;
            l2 = l2.next;
        }
        if (temp != 0) {
            p.next = new ListNode(1);
        }
        return h.next;

    }
}