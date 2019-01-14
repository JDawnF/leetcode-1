package t23;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else if (lists.length == 2) {
            return mergeTwoList(lists[0], lists[1]);

        } else {
            ListNode[] l1 = new ListNode[lists.length / 2];
            ListNode[] l2 = new ListNode[lists.length - lists.length / 2];
            for (int i = 0; i < lists.length; i++) {
                if (i < lists.length / 2)
                    l1[i] = lists[i];
                else
                    l2[i - lists.length / 2] = lists[i];
            }
            return mergeTwoList(mergeKLists(l1), mergeKLists(l2));
        }
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val >= l2.val) {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        }

    }

}