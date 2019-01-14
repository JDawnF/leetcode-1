package t231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return Math.pow(2, (Math.round(Math.log(n) / Math.log(2)))) == n;
    }
}