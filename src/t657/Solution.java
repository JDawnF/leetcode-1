package t657;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            String m = moves.substring(i, i + 1);
            if (m.equals("R")) {
                ++x;
            }
            if (m.equals("L")) {
                --x;
            }
            if (m.equals("U")) {
                ++y;
            }
            if (m.equals("D")) {
                --y;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}