import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        generateCombination(candidates, 0, target, new ArrayList<>(), answer);
        return answer;
    }

    private static void generateCombination(int[] candidates, int index, int target, List<Integer> combs, List<List<Integer>> answer) {
        if (target == 0) {
            answer.add(new ArrayList<>(combs));  // ✅ make deep copy
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }

        // include current element
        combs.add(candidates[index]);
        generateCombination(candidates, index, target - candidates[index], combs, answer);
        combs.remove(combs.size() - 1);  // ✅ proper backtracking

        // skip current element
        generateCombination(candidates, index + 1, target, combs, answer);
    }
}
