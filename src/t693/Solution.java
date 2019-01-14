package t693;

class Solution {
    public boolean hasAlternatingBits(int n) {
        String x = Integer.toBinaryString(n);
        System.out.print(x + " ");
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i - 1) == x.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}