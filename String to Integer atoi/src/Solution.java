class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("-91283472332"));
    }

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        boolean isNegative = false;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            isNegative = (s.charAt(i) == '-');
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (!isNegative && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNegative && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return isNegative ? (int) -result : (int) result;
    }
}