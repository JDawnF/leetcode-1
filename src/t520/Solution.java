package t520;

class Solution {
    public static boolean detectCapitalUse(String word) {
        boolean b = true;
        //如果全是是大写字母
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.trim().charAt(i) <= 90 && (int) word.trim().charAt(i) >= 65) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        if (b == true) {
            return b;
        }
        //如果全是是小写字母
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.trim().charAt(i) <= 122 && (int) word.trim().charAt(i) >= 97) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        if (b == true) {
            return b;
        }
        //如果第一个字母是大写,后面都是小写字母
        if ((int) word.trim().charAt(0) <= 90 && (int) word.trim().charAt(0) >= 65 && word.length() > 1) {
            for (int i = 1; i < word.length(); i++) {
                if ((int) word.trim().charAt(i) <= 122 && (int) word.trim().charAt(i) >= 97) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
        }

        return b;
    }
}