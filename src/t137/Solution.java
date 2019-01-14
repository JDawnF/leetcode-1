package t137;

class Solution {
    public int singleNumber(int[] nums) {
        //转成二进制,因为要对应为相加，所以统一转成32位的二进制数
        //new一个数组，用来存放每一位的二进制的和；
        int[] dight = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                dight[j] += (nums[i] >> j) & 1;
            }
        }
        //如果所有的数都出现三次，则每一位都必定可以被3整除，所以只需找出不能被3整除的位然后转成十进制即可；
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if (dight[i] % 3 == 1) {
                num += 1 << i;
            }
        }
        return num;
    }
}