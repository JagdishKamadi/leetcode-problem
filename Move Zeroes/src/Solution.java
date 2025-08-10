import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < len) {
            nums[count++] = 0;
        }
    }
}