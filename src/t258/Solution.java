package t258;

class Solution {
    public int addDigits(int num) {
        int s = sum(num);
        while (s / 10 > 0) {
            s = sum(s);
        }
        return s;
    }

    public int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int c = num % 10;
            sum += c;
            num /= 10;
        }
        return sum;
    }
}