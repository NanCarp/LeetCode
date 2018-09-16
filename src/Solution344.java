/**
 * 344. 反转字符串
 * Created by nanca on 9/16/2018.
 */
public class Solution344 {
    public String reverseString(String s) {
        int len = s.length();
        if (s == null || len < 2) {
            return s;
        }

        char[] a = new char[len];
        for (int i = 0; i < len; i++) {
            a[i] = s.charAt(len - i - 1);
        }
        return new String(a);
    }

}
