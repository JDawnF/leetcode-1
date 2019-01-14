package t868;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int binaryGap(int N) {
        List<Integer> l = new ArrayList<Integer>();
        String bn = Integer.toBinaryString(N);
        for (int i = 0; i < bn.length(); i++) {
            String x = bn.substring(i, i + 1);
            if (x.equals("1")) {
                l.add(i);
            }
        }
        int arr = 0;
        for (int k = 1; k < l.size(); k++) {
            int q = l.get(k) - l.get(k - 1);
            if (q > arr) {
                arr = q;
            }
        }
        return arr;
    }
}