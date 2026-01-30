import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int anotherNumber = target - nums[i];
            if (map.containsKey(anotherNumber)) {
                return new int[]{i, map.get(anotherNumber)};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
