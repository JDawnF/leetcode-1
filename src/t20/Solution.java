package t20;
//括号匹配的题用栈来做就行了，相似题目：Leetcode 32. 最长有效括号

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if (str.equals("(") || str.equals("[") || str.equals("{"))
                stack.push(s.substring(i, i + 1));
            else if (str.equals("}")) {
                if (i == 0 || stack.empty() || !stack.peek().equals("{")) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (str.equals("]")) {
                if (i == 0 || stack.empty() || !stack.peek().equals("[")) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (str.equals(")")) {
                if (i == 0 || stack.empty() || !stack.peek().equals("(")) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}