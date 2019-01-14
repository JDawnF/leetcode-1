package t3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "abbca";
        lengthOfLongestSubstring1(s);
        lengthOfLongestSubstring2(s);
    }

    //256大小的ASCII数组代替Hash表
    public static int lengthOfLongestSubstring1(String s) {
        int[] allChar = new int[256];
        int res = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            left = Math.max(left, allChar[s.charAt(i)]);
            allChar[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        System.out.println(res);
        return res;
    }

    //滑动窗口求解，好理解一些 详解看文章
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
        return ans;
    }
}
