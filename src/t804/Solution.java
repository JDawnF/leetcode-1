package t804;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

class Solution {
    static String[] s1 = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Pattern pattern2 = Pattern.compile("");
        //分割words数组，将每一个元素都放进list中
        List list = new ArrayList();
        for (int i = 0; i <= words.length - 1; i++) {
//            System.out.println(words[i]);
            list.add(words[i]);
        }
        String[] str;
        List<String> l = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        //分割字符串
        for (int i = 0; i <= list.size() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            str = pattern2.split((CharSequence) list.get(i));
            for (String s2 : str) {
                sb.append(s1[+s2.charAt(0) - 97]);
            }
//            将分割后的生成的每一个字串都放进list中
            l.add(sb.toString());
            // System.out.println(list.get(i)+" >>>> "+sb.toString());
        }
//        遍历Map,找出值一样的来除去，并且count+1
        for (String s : l) {
            Integer i = map.get(s);
            if (i == null) {
                map.put(s, 1);
            } else {
                map.put(s, i + 1);
            }
        }
        int count = 0;
        for (String key : map.keySet()) {
            count++;
        }
        return count;
    }

}