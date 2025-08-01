class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int[] temp = new int[n * n];
        int count = 0;

        for (int[] ints : matrix) {
            for (int i : ints) {
                temp[count++] = i;
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = temp[count++];
            }
        }
    }
}