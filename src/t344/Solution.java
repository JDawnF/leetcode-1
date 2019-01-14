package t344;

class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length(); i >= 1; i--) {
            System.out.println(s.substring(i - 1, i));
            sb.append(s.substring(i - 1, i));
        }
        return sb.toString();
    }
}