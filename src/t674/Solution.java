package t674;

class Solution {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = 1;
        int maxLen = len;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
                maxLen = Integer.max(maxLen, len);
            } else {
                len = 1;
            }
        }
        return maxLen;
    }
}