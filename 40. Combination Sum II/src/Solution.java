import java.util.*;

class Solution {

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // sort to handle duplicates
        backtrack(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void backtrack(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // stop if the number is greater than remaining target
            if (candidates[i] > target) break;

            tempList.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], tempList, result);
            tempList.remove(tempList.size() - 1); // backtrack
        }
    }
}
