package t35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                t = i + 1;
            }
            if (nums[i] == target) {
                t = i;
                break;
            }
        }
        return t;
    }
}