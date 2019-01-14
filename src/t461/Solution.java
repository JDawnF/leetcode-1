package t461;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Solution {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        Pattern p = Pattern.compile("");
        String[] a1 = p.split(a);
        String[] b1 = p.split(b);
        List la = new ArrayList();
        List lb = new ArrayList();
        if (a1.length < 32) {
            for (int i = 0; i < 32 - a1.length; i++) {
                la.add("0");
            }
            for (int i = 0; i < a1.length; i++) {
                la.add(a1[i]);
            }
        }
        if (b1.length < 32) {
            for (int i = 0; i < 32 - b1.length; i++) {
                lb.add("0");
            }
            for (int i = 0; i < b1.length; i++) {
                lb.add(b1[i]);
            }
        }

        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (!la.get(i).equals(lb.get(i))) {
                count++;
            }
        }
        return count;
    }
}