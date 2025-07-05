public class Main {
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(removeChars(s, 'a', 0));
    }

    private static String removeChars(String str, char target, int index) {
        if (index == str.length()) {
            return str;
        }
        if (str.charAt(index) == target) {
            str = str.substring(0, index) + str.substring(index + 1);
            return removeChars(str, target, index);
        }
        return removeChars(str, target, index + 1);
    }
}