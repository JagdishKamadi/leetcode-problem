import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Optional<Boolean> first = Arrays.stream(nums)
                .mapToObj(i -> (Integer) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(values -> values > 1)
                .map(b -> Boolean.TRUE)
                .findFirst();
        return first.isPresent();
    }
}