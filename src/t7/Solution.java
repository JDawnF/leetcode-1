package t7;

import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        Stack s = new Stack();
        if (x < 0) {
            x = Math.abs(x);
            sb.append("-");
        }
        Pattern p = Pattern.compile("");
        String[] px = p.split(String.valueOf(x));
        try {
            for (int k = 0; k < px.length; k++) {
                s.push(px[k]);
            }
            while (!s.empty()) {
                sb.append(s.pop());
            }
            System.out.println(sb.toString());
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}