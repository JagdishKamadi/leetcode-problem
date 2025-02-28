import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(new Solution().findErrorNums(arr)));
    }

    private static class Solution {
        public int[] findErrorNums(int[] nums) {

            int i = 0;
            int n = nums.length;

            while (i < n) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            for (i = 0; i < n; i++) {
                if (nums[i] != (i + 1)) {
                    return new int[]{nums[i], i + 1};
                }
            }

            return new int[]{-1, -1};
        }

        private static void swap(int[] arr, int start, int end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}