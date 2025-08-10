import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] digits = {1, 9, 0, 9};
        System.out.println(Arrays.toString(new Solution().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }
}