import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        new Solution().findDisappearedNumbers(arr);

        System.out.println(new Solution().findDisappearedNumbers(arr));

        System.out.println(Arrays.toString(arr));
    }

    private static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;

            while (i < nums.length) {
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            List<Integer> lst = new ArrayList<>();

            for (i = 0; i < nums.length; i++) {
                if (nums[i] != (i + 1)) {
                    lst.add(nums[i]);
                }
            }
            return lst;
        }

        private static void swap(int[] nums, int i, int correct) {
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
    }
}