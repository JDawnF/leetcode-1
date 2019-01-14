package t771;

import java.util.regex.Pattern;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        String regex = "";
        Pattern p = Pattern.compile(regex);
        String[] charj = p.split(J, J.length());
        String[] chars = p.split(S, S.length());
        for (int i = 0; i <= charj.length - 1; i++) {
            for (int j = 0; j <= chars.length - 1; j++) {
                if (charj[i].equals(chars[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}