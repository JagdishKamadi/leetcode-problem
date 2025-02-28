import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-5, 0, 9, 3, 6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = findMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }

    private static int findMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}