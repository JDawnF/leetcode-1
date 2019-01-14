package t90;

import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        helper(nums, res, cur, 0);
        return new ArrayList<List<Integer>>(res);
    }

    private void helper(int[] nums, Set<List<Integer>> res, List<Integer> cur, int start) {
        res.add(new ArrayList<>(cur));
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            helper(nums, res, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Solution s = new Solution();
        List<List<Integer>> list = s.subsetsWithDup(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}