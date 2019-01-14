package t50;

//快速幂思想
//当n >= 0 , res = x ^ n
//当n < 0 , res = 1 / (x ^ -n)
//然后使用二分法分奇数偶数求解 x ^ n。
//   1. 奇数, res = half * half * x;
//   2. 偶数, res = half * half
class Solution {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return myRowHelper(x, n);
        } else {
            return 1 / myRowHelper(x, -n);
        }
    }

    public double myRowHelper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = myRowHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}