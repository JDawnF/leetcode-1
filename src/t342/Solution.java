package t342;

class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        return Math.pow(4, (Math.round(Math.log(num) / Math.log(4)))) == num;
    }
}