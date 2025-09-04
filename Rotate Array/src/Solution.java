import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(ints, 3);
        Arrays.toString(ints);
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] firstArr = new int[k];
        for (int i = length - k, j = 0; i < length; i++, j++) {
            firstArr[j] = nums[i];
        }
        System.out.println(Arrays.toString(firstArr));

        int[] secondArr = new int[length - k];
        for (int i = 0; i < length - k; i++) {
            secondArr[i] = nums[i];
        }
        System.out.println(Arrays.toString(secondArr));

        for (int i = 0; i < k; i++) {
            nums[i] = firstArr[i];
        }

        System.out.println(Arrays.toString(nums));
        for (int i = k, j = 0; i < length; i++, j++) {
            System.out.println(Arrays.toString(nums));
            nums[i] = secondArr[j];
        }

        System.out.println(Arrays.toString(nums));

    }
}