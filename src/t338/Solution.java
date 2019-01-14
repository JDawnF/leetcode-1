package t338;

class Solution {
    public static int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int count = 0;
            for (int j = 31; j >= 0; j--) {
                int t = (i >> j) & 1;
                if (t == 1) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}