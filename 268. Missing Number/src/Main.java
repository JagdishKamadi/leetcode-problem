public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{3, 0, 1}));
    }

    private static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int totalSum = (n * (n + 1)) / 2;
            int actualSum = 0;

            for (int i : nums) {
                actualSum += i;
            }
            return totalSum - actualSum;
        }

    }
}