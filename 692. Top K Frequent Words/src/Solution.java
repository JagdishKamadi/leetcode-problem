import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        String[] strings = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        System.out.println(new Solution().topKFrequent(strings, k));
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(key -> key, Collectors.counting()));
        List<Map.Entry<String, Long>> entries = new ArrayList<>(collect.entrySet());
        entries.sort(comp);
        return entries.stream().map(Map.Entry::getKey).limit(k).toList();
    }

    private static final Comparator<Map.Entry<String, Long>> comp = (e1, e2) -> {
        if (e1.getValue().equals(e2.getValue())) {
            return e1.getKey().compareTo(e2.getKey());
        }
        return e2.getValue().compareTo(e1.getValue());
    };
}