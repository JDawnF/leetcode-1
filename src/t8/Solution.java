package t8;

class Solution {
    public static int myAtoi(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        String[] ss = str.split("\\s+");
        if (ss == null || ss.length == 0) {
            return 0;
        }
        String s = ss[0];
        if (s == null || s.length() == 0) {
            s = ss[1];
        }
        if (s.length() == 1) {
            switch (s) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    return Integer.valueOf(s);
                default:
                    return 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        switch (s.substring(0, 1)) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "-":
            case "+":
                sb.append(s.substring(0, 1));
                break;
            default:
                return 0;
        }
        String temp;
        boolean status;
        for (int i = 1; i < s.length(); i++) {
            status = false;
            temp = s.substring(i, i + 1);
            switch (temp) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    sb.append(temp);
                    break;
                default:
                    status = true;
            }
            if (status) {
                break;
            }

        }

        if (sb.length() == 0 || sb.length() == 1) {
            switch (sb.toString()) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    return Integer.valueOf(sb.toString());
                default:
                    return 0;
            }
        }
        if (sb.toString().substring(0, 1).equals("-")) {
            try {
                Integer integer = Integer.valueOf(sb.toString());
                return integer;
            } catch (Exception e) {
                return Integer.MIN_VALUE;
            }

        } else {
            try {
                Integer integer = Integer.valueOf(sb.toString());
                return integer;
            } catch (Exception e) {
                return Integer.MAX_VALUE;
            }
        }
    }
}