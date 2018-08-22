/**
 * 189. 旋转数组
 * Created by nanca on 8/22/2018.
 */
public class Solution189 {

    public void rotate(int[] nums, int k) {
        if ((nums.length > 1) && (k % nums.length > 0)) {
            int p = 0;
            int count = 0;
            int temp1 = nums[0];
            int temp2;
            int i = 0;
            while (count < nums.length) {
                i = (i + k) % nums.length;
                temp2 = nums[i];
                nums[i] = temp1;
                if (i == p) {
                    ++p;
                    ++i;
                    temp1 = nums[i];
                } else {
                    temp1 = temp2;
                }
                count++;
            }
        }
    }

}
