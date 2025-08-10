class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = new Solution().removeDuplicates(nums);

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int index = 1;

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}