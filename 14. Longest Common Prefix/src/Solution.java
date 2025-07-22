import java.util.Arrays;

class Solution {
    // first solution
    public String longestCommonPrefix(String[] strs) {
        int minStringSize = Integer.MAX_VALUE;

        for (String s : strs) {
            minStringSize = Math.min(minStringSize, s.length());
        }
        int count = 0;
        for (int i = 0; i < minStringSize; i++) {
            char ch = strs[0].charAt(i);
            for (String str : strs)
                if (str.charAt(i) != ch) {
                    return strs[0].substring(0, count);
                }
            count++;
        }
        return strs[0].substring(0, count);
    }

    // second solution
    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < Math.min(start.length(), end.length()); i++) {
            if (start.charAt(i) != end.charAt(i)) {
                return ans.toString();
            }
            ans.append(start.charAt(i));
        }
        return ans.toString();
    }
}