
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][size - 1]) {
                int[] oneDArr = matrix[i];
                int left = 0;
                int right = size - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (target == matrix[i][mid]) {
                        return true;
                    } else if (oneDArr[mid] < target) {
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