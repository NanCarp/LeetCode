/**
 * 66. 加一
 * Created by nanca on 9/6/2018.
 */
public class Solution066 {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        boolean plus = true;
        while (plus && i >= 0) {
            if (digits[i] != 9) {
                digits[i]++;
                plus = false;
            } else {
                digits[i] = 0;
                i--;
            }
        }
        if (plus) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < digits.length; j++) {
                result[j] = digits[j - 1];
            }
            return result;
        } else {
            return digits;
        }

    }

    public int[] plusOne2(int[] digits) {
        boolean add = true;
        int len = digits.length;
        for (int i = len - 1; i > -1; i--) {
            if (digits[i] == 9 ) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }
}
