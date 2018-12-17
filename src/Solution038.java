/**
 * Created by nanca on 12/17/2018.
 */
public class Solution038 {
    public static String countAndSay(int n) {
        String oldStr = "1";
        String newStr = "";
        for (int k = 1; k < n; k++) {
            for (int i = 0; i < oldStr.length();i++) {
                char a = oldStr.charAt(i);
                int cnt = 1;
                while (i < oldStr.length()) {
                    if (i + 1 < oldStr.length() && oldStr.charAt(i + 1) == a) {
                        cnt++;
                        i++;
                    } else {
                        break;
                    }
                }
                newStr += String.valueOf(cnt) + a;
            }
            oldStr = newStr;
            newStr = "";
        }
        return oldStr;
    }

    public static void main(String[] args) {
        for (int i = 1; i <=30; i ++) {
            System.out.println(i + ":" + countAndSay(i));
        }
//        System.out.println(countAndSay(3));
    }
}
