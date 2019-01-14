package t852;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int k = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                k = i;
                break;
            }
        }
        return k;
    }
}