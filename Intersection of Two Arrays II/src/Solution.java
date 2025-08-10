import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersect = new Solution().intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;

        // Store intersection directly in nums1 to avoid extra list
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
