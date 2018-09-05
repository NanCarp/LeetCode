/**
 * 350. 两个数组的交集 II
 * Created by nanca on 9/5/2018.
 */
public class Solution350 {
    // TODO to be optimized
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] outer;
        int[] inner;

        if (nums1.length > nums2.length) {
            outer = nums1;
            inner = nums2;
        } else {
            outer = nums2;
            inner = nums1;
        }

        int size = 0;
        for (int i = 0; i < outer.length; i++) {
            for (int j = size; j < inner.length; j++) {
                if (outer[i] == inner[j]) {
                    int temp = inner[j];
                    inner[j] = inner[size];
                    inner[size] = temp;
                    size++;
                    break;
                }
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = inner[i];
        }
        return result;
    }
}
