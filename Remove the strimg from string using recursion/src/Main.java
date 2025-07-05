import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String s = "Apple Banana Apple Banana Oranges Mango Guava Apple";
        System.out.println(skipTargetString(s, "Guava"));
    }

    private static String skipTargetString(String str, String target) {
        return Stream.of(str.split("\\s+"))
                .filter(s -> !s.equalsIgnoreCase(target))
                .collect(Collectors.joining(" "));
    }
}