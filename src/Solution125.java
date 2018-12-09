/**
 * Created by nanca on 12/9/2018.
 */
public class Solution125 {
    /*public boolean isPalindrome(String s) {
        char[] ss = s.toCharArray();
        int length = ss.length;
        for (int i = 0, j = length -1; i<=j && i < length && j > 0; i++,j-- ) {
            if (ss[i] != ss[j]) {
                return false;
            }
        }

        return true;
    }*/

    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        char[] ss = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase().toCharArray();
        int length = ss.length;
        if (length == 0) {
            return true;
        }

        for (int i = 0, j = length -1; i<=j && i < length && j > 0; i++,j-- ) {
            if (ss[i] != ss[j]) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(String s) {
        char[] cha = s.toCharArray();
        int i = 0, j = cha.length - 1;
        while(i < j){
            if(!Character.isLetterOrDigit(cha[i]))
                i++;
            else if(!Character.isLetterOrDigit(cha[j]))
                j--;
            else
            if(Character.toLowerCase(cha[i]) == Character.toLowerCase(cha[j])){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;

    }
}
