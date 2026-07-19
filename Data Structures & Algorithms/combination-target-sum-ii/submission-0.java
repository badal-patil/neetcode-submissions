
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates and enable pruning
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] candidates, int target, int start, 
                           List<Integer> current, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current)); // Found valid combination
            return;
        }
        if (target < 0) {
            return; // Exceeded target, prune
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursive level
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]); // Choose candidate
            backtrack(candidates, target - candidates[i], i + 1, current, results); // Recurse with next index (i+1) because elements used at most once
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
