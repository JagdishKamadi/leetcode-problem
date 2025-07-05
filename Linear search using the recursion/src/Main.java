public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 90, 56};

        System.out.println(linearSearch(nums, 056, 0));
    }

    private static boolean linearSearch(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }

        return nums[index] == target || linearSearch(nums, target, index + 1);
    }
}