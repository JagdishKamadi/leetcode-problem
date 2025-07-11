
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix[0].length;
        for (int[] ints : matrix) {
            if (target >= ints[0] && target <= ints[size - 1]) {
                int left = 0;
                int right = size - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (target == ints[mid]) {
                        return true;
                    } else if (ints[mid] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return false;
    }
}