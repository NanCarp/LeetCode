/**
 * Created by nanca on 12/13/2018.
 */
public class Solution028 {
    public static int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        int location = -1;
        boolean findNextHead = false;
        boolean found = false;
        char c = needle.charAt(0);
        while(!found) {
            for (int i = location + 1; i < haystack.length(); i++) {
                if (c == haystack.charAt(i)) {
                    location = i;
                    findNextHead = true;
                    break;
                }
            }
            if (!findNextHead || (location + needle.length()) > haystack.length()) {
                return -1;
            }
            found = true;
            for (int i = 1; i < needle.length(); i++) {
                if (needle.charAt(i) != haystack.charAt(location + i)) {
                    findNextHead = false;
                    found = false;
                    break;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        //assert 0 == strStr("a", "");
        //assert 2 == strStr("hello", "ll");
        //assert -1 == strStr("aaaaa", "bba");
       // assert 4 == strStr("mississippi", "issip");
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("mississippi", "issip"));
    }
}
