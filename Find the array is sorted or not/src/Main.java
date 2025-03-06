public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(isSorted(nums));
    }

    private static boolean isSorted(int[] nums) {

        return helper(nums, 0);
    }

    private static boolean helper(int[] nums, int baseCount) {
        if (baseCount == nums.length-1) {
            return true;
        }

        if (nums[baseCount] > nums[baseCount + 1]) {
            return false;
        }
        return helper(nums, baseCount + 1);
    }
}