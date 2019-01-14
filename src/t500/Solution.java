package t500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findWords(String[] words) {
        String s1 = "QWERTYUIOPqwertyuiop", s2 = "ASDFGHJKLasdfghjkl", s3 = "ZXCVBNMzxcvbnm";
        Map map = new HashMap<>();
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.substring(i, i + 1), 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.substring(i, i + 1), 2);
        }
        for (int i = 0; i < s3.length(); i++) {
            map.put(s3.substring(i, i + 1), 3);
        }
        boolean flag = true;
        for (int k = 0; k < words.length; k++) {
            flag = true;
            System.out.println(words[k] + "   ");
            for (int j = 0; j < words[k].length() - 1; j++) {
                System.out.print("  " + words[k].substring(j, j + 1) + " " + words[k].substring(j + 1, j + 2));
                System.out.println("  " + map.get(words[k].substring(j, j + 1)) + " " + map.get(words[k].substring(j + 1, j + 2)));
                if (map.get(words[k].substring(j, j + 1)) != map.get(words[k].substring(j + 1, j + 2))) {
                    flag = false;
                }
                if (words[k].length() == 1) {
                    l.add(words[k]);
                }
            }
            if (flag == true) {
                l.add(words[k]);
            }
        }

        String[] s = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            s[i] = l.get(i);
        }
        System.out.println("-------------");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("-------------");
        return s;
    }
}

