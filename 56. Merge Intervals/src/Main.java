import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{1, 4}, {4, 5}};
        int[][] merge = new Solution().merge(nums);

        for (int[] res : merge) {
            System.out.println(Arrays.toString(res));
        }
    }

    private static class Solution {
        public int[][] merge(int[][] intervals) {
            int length = intervals.length;
            int[][] result = new int[length][2];
            int count = 0;
            Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
            result[0][0] = intervals[0][0];
            result[0][1] = intervals[0][1];

            for (int i = 1; i < length; i++) {
                if (intervals[i][0] <= result[count][1]) {
                    result[count][1] = Math.max(result[count][1], intervals[i][1]);
                } else {
                    count++;
                    result[count][0] = intervals[i][0];
                    result[count][1] = intervals[i][1];
                }
            }
            return Arrays.copyOf(result, count + 1);
        }
    }
}