package t371;

//位运算实现加法
//位的异或运算跟求'和'的结果一致：
//异或 1^1=0 1^0=1 0^0=0
//求和 1+1=0 1+0=1 0+0=0
//位的与运算跟求'进位‘的结果一致：
//位与 1&1=1 1&0=0 0&0=0
//进位 1+1=1 1+0=0 0+0=0
class Solution {
    //递归实现
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        int s = a ^ b;
        int c = (a & b) << 1;
        return getSum(s, c);
    }

    //循环形式
    public int add(int a, int b) {
        int s, c;
        while (b != 0) {
            s = a ^ b;
            c = (a & b) << 1;
            a = s;
            b = c;
        }
        return a;
    }
}