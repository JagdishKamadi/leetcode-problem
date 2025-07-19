import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }

    private static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int maxLength = 0;
            HashSet<Character> charSet = new HashSet<>();

            for (int right = 0; right < s.length(); right++) {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }

                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }
}