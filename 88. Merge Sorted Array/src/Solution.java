class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] num3 = new int[m + n];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while (count1 < m && count2 < n) {

            if (nums1[count1] <= nums2[count2]) {
                num3[count3++] = nums1[count1++];
            } else {
                num3[count3++] = nums2[count2++];
            }
        }

        while (count1 < m) {
            num3[count3++] = nums1[count1++];
        }

        while (count2 < n) {
            num3[count3++] = nums2[count2++];
        }

        // last step insert into num1 array
        for (int i = 0; i < num3.length; i++) {
            nums1[i] = num3[i];
        }
    }
}