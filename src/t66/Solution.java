package t66;
//相似题目：Leetcode 2.两数相加
//        Leetcode 445.两数相加 II

import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        //new两个栈，一个取数一个存数
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for (int i = 0; i < digits.length; i++) {
            stack1.push(digits[i]);
        }
        //进位
        int carry = 0;
        //原数组长度，最后一位+1后压入堆栈
        int k = digits.length;
        //加上进位后的新数的位数，考虑9999的情况，加1变成10000
        int q = 0;
        while (!stack1.empty()) {
            int temp = carry;
            if (k == digits.length) {
                temp = temp + stack1.peek() + 1;
            } else {
                temp = temp + stack1.peek();
            }
            stack1.pop();
            carry = 0;
            if (temp >= 10) {
                temp = temp - 10;
                carry = 1;
            }
            stack2.push(temp);
            k--;
            q++;
        }
        //如果最前面那一位有进位，再补一位
        if (carry == 1) {
            stack2.push(1);
            q++;
        }
        //new一个新数组装新数
        int[] arr = new int[q];
        int f = 0;
        while (!stack2.empty()) {
            arr[f] = stack2.peek();
            stack2.pop();
            f++;
        }
        return arr;
    }
}