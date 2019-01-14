package t191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int j = 31; j >= 0; j--) {
            int t = (n >> j) & 1;
            if (t == 1) {
                count++;
            }
        }
        return count;
    }
}