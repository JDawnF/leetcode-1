package t5;

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 0) {
            return "";
        }
        String result = s.substring(0, 1);
        for (int i = 0; i < len - 1; i++) {
            String temp = midToSide(s, i, i);
            if (temp.length() > result.length())
                result = temp;
            temp = midToSide(s, i, i + 1);
            if (temp.length() > result.length())
                result = temp;
        }
        return result;
    }

    String midToSide(String s, int left, int right) {
        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}