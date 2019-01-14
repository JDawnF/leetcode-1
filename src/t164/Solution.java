package t164;

import java.util.Arrays;

//Hard难度？excuse me?
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        if (nums.length < 2) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > max) {
                max = nums[i] - nums[i - 1];
            }
        }
        return max;
    }
}