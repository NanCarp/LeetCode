/**
 * 283. 移动零
 * Created by nanca on 9/8/2018.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int firstZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstZero = i;
                break;
            }
        }
        if (firstZero > -1) {
            for (int i = firstZero + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[firstZero] = nums[i];
                    nums[i] = 0;
                    firstZero++;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        if (null == nums || nums.length < 2) {
            return;
        }
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] =  0;
        }
    }
}
