import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {7, 4, 9, 34, 56, 1, 8, 9};

        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    private static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return sortAndMerge(left, right);
    }

    private static int[] sortAndMerge(int[] first, int[] second) {
        int firstArrLength = first.length;
        int secondArrLength = second.length;

        int[] mix = new int[firstArrLength + secondArrLength];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArrLength && j < secondArrLength) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < firstArrLength) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < secondArrLength) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}