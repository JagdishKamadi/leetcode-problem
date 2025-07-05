public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                candidate = i;  // Set new candidate
            }
            count += (i == candidate) ? 1 : -1;  // Vote for/against
        }
        return candidate;
    }
}