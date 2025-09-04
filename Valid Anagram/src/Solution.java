class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }

        int[] frequenciesOfStringS = new int[26];

        for (int i = 0; i < sLen; i++) {
            frequenciesOfStringS[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < tLen; i++) {
            if (frequenciesOfStringS[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            frequenciesOfStringS[t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
}