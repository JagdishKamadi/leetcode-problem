public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 90};

        System.out.println(bs(arr, 90, 0, arr.length-1));
    }

    private static int bs(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return bs(nums, target, mid + 1, end);
        } else {
            return bs(nums, target, start, mid - 1);
        }
    }
}