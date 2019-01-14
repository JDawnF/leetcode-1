package t27;

/**
 * 这是道水题，做法很简单
 * 一个当前位置i一个当前长度n，顺着找，如果相等就把当前有效位置的最后一个放到i上，然后n--，自然就没了
 * 如果不是的话，i++，继续找下一个
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                n--;
                nums[i] = nums[n];
            } else {
                i++;
            }
        }
        return n;
    }
}