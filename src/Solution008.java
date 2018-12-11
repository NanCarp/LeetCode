/**
 * Created by nanca on 12/10/2018.
 */
public class Solution008 {
    public static int myAtoi(String str) {
        if("".equals(str)) {
            return 0;
        }

        int h = -1;
        int t = -1;
        int i = 0;
        int isPlus = 1;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == ' ') {
                i++;
            } else if (c == '-') {
                isPlus = -1;
                i++;
                break;
            } else if (c == '+') {
                isPlus = 1;
                i++;
                break;
            } else {
                break;
            }
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c > '0' && c <= '9') {
                h = i;
                i++;
                break;
            } else if (c == '0') {
                i++;
            } else {
                return 0;
            }
        }

        if (h == -1) {
            return 0;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                break;
            }
            i++;
        }
        t = i;

        String v;
        String max = "2147483647";
        int maxInt = 2147483647;
        String min = "-2147483648";
        int minInt = -2147483648;

        int length = t - h;

        v = str.substring(h, t);
        if (isPlus == 1) {
            if (length > 10) {
                return maxInt;
            } else if (length == 10) {
                int j = 0;
                while (j < v.length()) {
                    if (v.charAt(j) == max.charAt(j)) {
                        j++;
                    } else if (v.charAt(j) > max.charAt(j)) {
                        return maxInt;
                    } else {
                        break;
                    }
                }
            }
            return Integer.valueOf(v);
        } else {
            if (length > 10) {
                return minInt;
            } else if (length == 10){
                int j = 0;
                while (j < v.length()) {
                    if (v.charAt(j) == min.charAt(j + 1)) {
                        j++;
                    } else if (v.charAt(j) > min.charAt(j + 1)) {
                        return minInt;
                    } else {
                        break;
                    }
                }
            }
            return Integer.valueOf("-" + v);
        }
    }



    public static void main(String[] args) {
        //System.out.println('0'*1);
        //System.out.println('9'*1);
        //System.out.println('a'*1);
//        System.out.println(1);
//        System.out.println("expect 4193 " + myAtoi("4193 dddddd"));
//        System.out.println("expect -1111114193 " + myAtoi("-1111114193 dddddd"));
//        System.out.println("expect 0 " + myAtoi("+"));
//        System.out.println("expect -2147483648 " + myAtoi("-2147483648"));
//        System.out.println("expect 1 " + myAtoi("1"));
//        System.out.println("expect 12345678 " + myAtoi("  0000000000012345678"));
//        System.out.println("expect 0 " + myAtoi("+-2"));
//        System.out.println("expect 4500 " + myAtoi("     +004500"));
        System.out.println("expect -2147483648 " + myAtoi("-2147483649"));
    }
}
