package t1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List l = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {

            if (count != 0) {
                break;
            } else {
                for (int j = nums.length - 1; j >= 1; j--) {
                    if ((nums[j] == (target - nums[i])) && i != j) {
                        l.add(i);
                        l.add(j);
                        count++;
                        break;
                    }
                }
            }
        }
        int[] a = new int[l.size()];
        for (int k = 0; k <= l.size() - 1; k++) {
            a[k] = (int) l.get(k);
        }
        return a;
    }
}