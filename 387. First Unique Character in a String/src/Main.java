public class Main {
    public static void main(String[] args) {

        String s = "aabb";

        System.out.println(new Solution().firstUniqChar(s));
    }

    private static class Solution {
        public int firstUniqChar(String s) {

            Character character = s.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                    .findFirst()
                    .orElse('&');

            return s.indexOf(character);
        }
    }
}