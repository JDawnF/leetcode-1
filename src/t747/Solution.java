package t747;

import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int t = 0;
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        if (arr[arr.length - 1] >= 2 * arr[arr.length - 2]) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == arr[arr.length - 1]) {
                    t = i;
                }
            }
            return t;
        } else {
            return -1;
        }
    }
}