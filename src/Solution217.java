/**
 * 217. 存在重复元素
 * Created by nanca on 9/4/2018.
 */
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {

        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i + 1];
            int x = i + 1;
            for (int j = i; j >= 0; j--) {
                if (nums[j] > temp) {
                    continue;
                }

                if (nums[j] == temp) {
                    return true;
                }

                if (nums[j] < temp) {
                    x = j + 1;
                    break;
                }
            }
            for (int k = i + 1; k > x; k--) {
                nums[k] = nums[k-1];
            }
            nums[x] = temp;
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(nums[i] > nums[j])
                {
                    break;
                }
                else if(nums[i] == nums[j])
                {
                    return true;
                }
            }

        }
        return false;
    }
}
