import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int otherElement = target - nums[i];
            if (map.containsKey(otherElement)) {
                return new int[]{map.get(otherElement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}