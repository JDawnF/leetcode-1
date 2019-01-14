package t441;

//一开始是用DP累加做的，接着就超内存了
//这样倒着每次减去i，推到n=0时的那一行即可
class Solution {
    public static int arrangeCoins(int n) {
        int i;
        for (i = 1; n > 0; i++) {
            n = n - i;
        }
        if (n < 0)
            return i - 2;
        else
            return i - 1;
    }
}
