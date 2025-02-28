public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    private static class Solution {
        public int findDuplicate(int[] nums) {

            int i = 0;

            while (i < nums.length) {
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            for (i = 0; i < nums.length; i++) {
                if (nums[i] != (i + 1)) {
                    return nums[i];
                }
            }
            return -1;
        }

        private static void swap(int[] nums, int i, int correct) {
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
    }
}