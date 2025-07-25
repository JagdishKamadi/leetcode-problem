class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        int idx = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            char ch = chars[i];

            while (i < length && ch == chars[i]) {
                count++;
                i++;
            }

            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[idx++] = c;
                }
            }
            // back to original loop index
            i--;
        }
        return idx;
    }
}