package t709;

import java.util.regex.Pattern;

class Solution {
    public String toLowerCase(String str) {
        Pattern p = Pattern.compile("");
        String[] s = p.split(str);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length; i++) {
            String sp = s[i];
            char[] c = sp.toCharArray();
            int n = (Integer.valueOf(c[0]));
            if (64 < n && n < 91) {
                n = n + 32;
            }
            sb.append((char) n);
        }
        return sb.toString();
    }
}