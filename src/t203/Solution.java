package t203;

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
        next = null;
    }
}
//这个题有点坑，交了9次终于过了，每次都是少了条件，要考虑删头结点，中间节点和尾节点的情况，也要考虑头结点为空的情况等
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        if (head == null)
            return null;
        ListNode preNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.val == val) {
                preNode.next = currentNode.next;
                currentNode = currentNode.next;
            } else {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;

    }
}
