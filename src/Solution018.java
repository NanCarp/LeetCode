/**
 * Created by nanca on 12/18/2018.
 */
public class Solution018 {
    public static String longestCommonPrefix(String[] strs) {
        String r = "";
        if (strs == null || strs.length < 1) {
            return "";
        }
        String first = strs[0];
        if ("".equals(first)) {
            return "";
        }
        int x = 0;
        while (x < first.length()) {
            char c = first.charAt(x);
            boolean equal = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= x || strs[i].charAt(x) != c) {
                    equal = false;
                    break;
                }
            }
            if (!equal) {
                break;
            }
            x++;
            r+=c;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"c","c"}));
    }
}
