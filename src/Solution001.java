/**
 * 1. 两数之和
 * Created by nanca on 9/11/2018.
 */
public class Solution001 {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }

        for (int i = 0; i < nums.length -1; i++) {
            int x = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (x == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

}
