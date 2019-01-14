package t442;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0)
                l1.add(num);
            else
                nums[num - 1] = 0 - nums[num - 1];
        }
        return l1;

    }
}