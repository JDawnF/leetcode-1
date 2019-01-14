package t445;

import java.util.Stack;

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack s1 = new Stack<Integer>();
        Stack s2 = new Stack<Integer>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        Stack s3 = new Stack<Integer>();
        int carry = 0;
        while (!s1.empty() || !s2.empty()) {
            int tempsum = carry;
            if (!s1.empty()) {
                tempsum += (int) s1.peek();
                System.out.print(" s1.top():" + s1.peek());
                s1.pop();
            }
            if (!s2.empty()) {
                tempsum += (int) s2.peek();
                System.out.print(" s2.top():" + s2.peek());
                s2.pop();
            }
            carry = 0;
            if (tempsum >= 10) {
                tempsum = tempsum - 10;
                carry = 1;
            }
            System.out.println(" sum:" + tempsum);
            s3.push(tempsum);
        }
        if (carry == 1) {
            s3.push(1);
        }
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (!s3.empty()) {
            cur.next = new ListNode((int) s3.peek());
            s3.pop();
            cur = cur.next;
        }
        return result.next;
    }

}