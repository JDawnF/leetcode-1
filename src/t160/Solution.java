package t160;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
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

//牛客网剑指offer：两个链表的第一个公共结点
// https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46
//思路：如果存在共同节点的话，那么从该节点，两个链表之后的元素都是相同的。也就是说两个链表从尾部往前到某个点，节点都是一样的。
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode phead1 = headA;
        ListNode phead2 = headB;
        int length1 = getListLength(headA);
        int length2 = getListLength(headB);
        if (length1 >= length2) {
            int k = length1 - length2;
            while (k > 0) {
                phead1 = phead1.next;
                k--;
            }
        } else {
            int k = length2 - length1;
            while (k > 0) {
                phead2 = phead2.next;
                k--;
            }
        }
        while (phead1 != phead2) {
            phead1 = phead1.next;
            phead2 = phead2.next;
        }
        return phead1;
    }


    public int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}