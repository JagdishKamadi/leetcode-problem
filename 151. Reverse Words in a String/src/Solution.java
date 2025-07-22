import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.strip().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
