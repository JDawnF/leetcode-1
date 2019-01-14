package t24;

/**
 * @author 菠萝赛东
 */

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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode left = preHead;
        ListNode mid = head;
        //如果只有一个节点，直接返回这个节点
        if (head.next == null) {
            return head;
        }
        ListNode right = head.next;
        while (mid != null && mid.next != null) {
            mid.next = right.next;
            right.next = mid;
            left.next = right;
            left = mid;
            mid = left.next;
            if (mid != null) {
                right = mid.next;
            }
        }
        return preHead.next;
    }
}
