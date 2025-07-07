class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int counter = 0;
        int size = nums.length;
        int i = 0;

        while (i < size) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < maxSum) {
                while (currentSum < maxSum && counter < size) {
                    currentSum = currentSum - nums[counter];
                    counter++;
                }
            }
            i++;
        }
        return maxSum;
    }
}