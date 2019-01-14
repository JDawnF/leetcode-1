package t67;
//相同思路的题目 Leetcode 445.两数相加

import java.util.Stack;

class Solution {
    public static String addBinary(String a, String b) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            s1.push(Integer.parseInt(a.substring(i, i + 1)));
        }
        for (int i = 0; i < b.length(); i++) {
            s2.push(Integer.parseInt(b.substring(i, i + 1)));
        }
        int carry = 0;
        while (!s1.empty() || !s2.empty()) {
            int temp = carry;
            if (!s1.empty()) {
                temp += s1.peek();
                s1.pop();
            }
            if (!s2.empty()) {
                temp += s2.peek();
                s2.pop();
            }
            carry = 0;
            if (temp > 1) {
                temp = temp - 2;
                carry = 1;
            }
            s3.push(temp);
        }

        if (carry == 1) {
            s3.push(1);
        }
        StringBuffer sb = new StringBuffer();
        while (!s3.empty()) {
            sb.append(s3.peek());
            s3.pop();
        }
        return sb.toString();
    }
}