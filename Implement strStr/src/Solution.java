class Solution {

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        System.out.println(new Solution().strStr(haystack, needle)); // expected 4
    }

    public int strStr(String haystack, String needle) {
        int haystackSize = haystack.length();
        int needleSize = needle.length();

        if (needleSize == 0) return 0;   // edge case: empty needle
        if (haystackSize < needleSize) return -1;

        for (int i = 0; i <= haystackSize - needleSize; i++) {
            int j = 0;
            while (j < needleSize && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleSize) {
                return i; // full needle matched
            }
        }
        return -1;
    }
}
