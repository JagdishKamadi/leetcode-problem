import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(new Solution().rearrangeArray(nums)));
    }

    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] positiveNums = new int[len / 2];
        int[] negativeNums = new int[len / 2];
        int c1 = 0, c2 = 0;
        Character.toU

        // Separate positives and negatives
        for (int num : nums) {
            if (num > 0) {
                positiveNums[c1++] = num;
            } else {
                negativeNums[c2++] = num;
            }
        }

        // Merge alternately
        int[] result = new int[len];
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < len; i += 2) {
            result[i] = positiveNums[c1++];
            result[i + 1] = negativeNums[c2++];
        }

        return result;
    }
}
