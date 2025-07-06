class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length * grid[0].length;
        int[] freq = new int[size + 1];
        for (int[] ints : grid) {
            for (int i : ints) {
                freq[i]++;
            }
        }

        // now calculate the repeat and missing number
        int repeat = 0;
        int missing = 0;
        for (int i = 1; i < size + 1; i++) {
            if (freq[i] >= 2) {
                repeat = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeat, missing};
    }
}