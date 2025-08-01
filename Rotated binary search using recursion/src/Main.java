public class Main {
    public static void main(String[] args) {

        int[] nums = {5, 6, 7, 8, 9, 1, 2, 3};

        System.out.println(rbs(nums, 3));
    }

    private static int rbs(int[] nums, int target) {

        return helper(nums, target, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return helper(nums, target, start, mid - 1);
            } else {
                return helper(nums, target, mid + 1, end);
            }
        }

        if (target >= nums[mid] && target <= nums[end]) {
            return helper(nums, target, mid + 1, end);
        }
        return helper(nums, target, start, mid - 1);
    }
}