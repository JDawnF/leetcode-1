package t78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>(); // 空子集
        res.add(subset);

        for (int i = 0; i < nums.length; i++) {
            // 遍历元素，将元素依次加进数组；
            int length = res.size();
            for (int j = 0; j < length; j++) {
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }
}