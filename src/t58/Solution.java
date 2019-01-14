package t58;

class Solution {
    public int lengthOfLastWord(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        String[] word = s.split("\\s");
        return word[word.length - 1].length();
    }
}