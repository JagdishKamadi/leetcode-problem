public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(new Solution().firstMissingPositive(arr));
    }

    private static class Solution {
        public int firstMissingPositive(int[] nums) {

            int i = 0;
            int n = nums.length;

            while (i < n) {
                int correct = nums[i] - 1;
                if ((nums[i] > 0 && nums[i] < n) && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            for (i = 0; i < n; i++) {
                if (nums[i] != (i + 1)) {
                    return i + 1;
                }
            }

            return n + 1;
        }

        private static void swap(int[] arr, int start, int end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}