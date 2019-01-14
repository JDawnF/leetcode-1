package t233;

class Solution {
    //你是不是想这样做？给你个9999999试试，肯定超时，要不然这个题肯定是简单题了，也不会只有这么点人通过了
    // public int countDigitOne(int n) {
    //     int count=0;
    //     for(int i=0;i<=n;i++){
    //         String x=String.valueOf(i);
    //         for(int j=0;j<x.length();j++){
    //             if(x.substring(j,j+1).equals("1")){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public int countDigitOne(int n) {
        int count = 0, previous = 0, coef = 1;
        while (n > 0) {
            int remain = n % 10;
            int over = n / 10;
            if (remain > 1) {
                count += coef;
            } else if (remain == 1) {
                count += previous + 1;
            }
            count += coef * over;
            previous += coef * remain;
            coef *= 10;
            n /= 10;
        }
        return count;
    }
}