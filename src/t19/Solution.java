package t19;

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

//快慢指针
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        ListNode p = head;
        ListNode q = head;
        //p先移动n个节点
        for (int i = 1; i <= n; i++) {
            p = p.next;
        }
        //如果p移动n个节点以后为null，说明head就是倒数第n个节点
        if (p == null) {
            head = head.next;
            return head;
        }
        //否则p和q一起移动，当p移动到终点的时候，q为倒数第n个节点
        p = p.next;
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}