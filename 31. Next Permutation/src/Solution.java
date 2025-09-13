import java.util.Arrays;

class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }

        int i = 1;
        int lastIndex = -1;
        // first find the peak element
        while (i < n) {
            if (arr[i] > arr[i - 1]) {
                lastIndex = i;
            }
            i++;
        }

        if (lastIndex == -1) { // if the array is descending order, then we must return in reverse order
            int left = 0, right = n - 1;
            while (left < right) {
                swap(arr, left++, right--);
            }
            return;
        }

        int index = lastIndex;
        for (i = lastIndex; i < n; i++) {
            if (arr[i] > arr[lastIndex - 1] && arr[i] < arr[index]) {
                index = i;
            }
        }
        swap(arr, lastIndex - 1, index);
        Arrays.sort(arr, lastIndex, n);
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        new Solution().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}