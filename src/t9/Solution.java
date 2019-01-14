package t9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int m = 0;
        while (x > m) {
            m = m * 10 + x % 10;
            x /= 10;
        }
        return x == m || x == m / 10;
    }
}