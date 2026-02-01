import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Solution().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
