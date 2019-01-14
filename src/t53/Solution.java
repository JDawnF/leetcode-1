package t53;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int tmp = sum;
        for (int i = 1; i < nums.length; i++) {
            tmp = tmp < 0 ? nums[i] : tmp + nums[i];
            sum = Math.max(sum, tmp);
        }
        return sum;
    }
}