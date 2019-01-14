package t260;

class Solution {
    //具体说来，这个题是136题的引申。我们所要考虑的是，如何把这个问题转化为136题中的问题。
//如果我们简单描述这个题的话，数组是2n+x+y，其中2n是值出现两次的数字，x和y是只出现一次的两个数字，
//那么我们的问题就是如何将数组分成两部分即2a+x和2b+y其中a+b=n。
//对于两个不同的数x和y，求异或x^y=z的结果一定不为0，那么我们根据z即可把x和y分开，
//同时，我们可以根据z把重复出现2次的n个数也分到两组里，而且一定是成对分开的。
//这样分开后，就会出现2a+x和2b+y两组数。
    public int[] singleNumber(int[] nums) {
        int z = 0;
        //1.求z=x^y
        for (int i = 0; i < nums.length; i++) {
            z = z ^ nums[i];
        }
        int[] result = new int[2];
        //2.然后根据z把所有的数分为两组numsA[], numsB[]:由于z是x和y异或所得，
        //所以z中任意一个为1的二进制位都可以把x和y区分开，
        //因为z中为1的二进制位意味者x和y的对应位上一个为0一个为1，
        //我们可以跟据求逻辑与的结果来把x和y区分开。
        //得出两个数异或结果的最右边的一个1，其他的为零，这样进行&操作就可以将两个不同的数分到不同的两组去
        z &= -z;
        //对numsA[]循环异或求得目标x，对numsB[]循环异或求得目标y
        for (int i = 0; i < nums.length; i++) {
            if ((z & nums[i]) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }
}