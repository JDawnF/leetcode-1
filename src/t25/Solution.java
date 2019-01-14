package t25;
/**
 * 参考《程序员代码面试指南》
 * 首先,如果K的值小于2,不用进行任何调整。因为K<1没有意义。
 * K=1时,代表每1个节点为1组进行逆序,原链表也没有任何变化。
 * <p>
 * 可以利用栈结构来解题。
 * <p>
 * 1.从左到右遍历链表,如果栈的大小不等于K,就将节点不断压入栈中。
 * <p>
 * 2.当栈的大小第一次到达K时,说明第一次凑齐了K个节点进行逆序,从栈中依次弹出这些节点,并根据弹出的顺序重新连接,这一组逆序完成后,
 * 需要记录一下新的头部,同时第一组的最后一个节点(原来是头节点)应该连接下一个节点。
 * 例如:链表1->2->3-4>5->6->7->8->null,K=3。第一组节点进入栈,从栈顶到栈底依次为3,2,1。逆序重连之后为3->2->1->...,
 * 然后节点1去连接节点4,链表变为3->2->1->4>5->6->7->8->null,之后从节点4开始不断处理K个节点为一组的后续情况,也就是步骤3,并且需要记录节点3,
 * 因为链表的头部己经改变,整个过程结束后需要返回这个新的头节点,记为 new Head
 * <p>
 * 3.步骤2之后,当栈的大小每次到达K时,说明又凑齐了一组应该进行逆序的节点,从栈中依次弹出这些节点,并根据弹出的顺序重新连接。
 * 这一组逆序完成后,该组的第一个节点(原来是该组最后一个节点)应该被上一组的最后一个节点连接上,
 * 这一组的最后一个节点(原来是该组第一个节点)应该连接下一个节点。然后继续去凑下一组,直到链表都被遍历完。
 * 例如:链表3->2->1-4->5-6->7->8-null,K=3,第一组已经处理完。
 * 第二组从栈顶到栈底依次为6,5,4。逆序重连之后为6->5->4,然后节点6应该被节点1连接,节点4应该连接节点7,
 * 链表变为3->2->1->6->5-4->7->8->null。然后继续从节点7往下遍历
 * <p>
 * 4.最后应该返回 newHead,作为链表新的头节点
 */

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
    }
}

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2)
            return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode newhead = head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            stack.push(cur);
            if (stack.size() == k) {
                pre = resign(stack, pre, next);
                newhead = newhead == head ? cur : newhead;
            }
            cur = next;
        }
        return newhead;
    }

    public ListNode resign(Stack<ListNode> stack, ListNode left, ListNode right) {
        ListNode cur = stack.pop();
        if (left != null) {
            left.next = cur;
        }
        ListNode next = null;
        while (!stack.isEmpty()) {
            next = stack.pop();
            cur.next = next;
            cur = next;
        }
        cur.next = right;
        return cur;
    }
}
