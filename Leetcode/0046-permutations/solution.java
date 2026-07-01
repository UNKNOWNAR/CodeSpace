class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        backTrack(nums, temp, used);
        return ans;
    }
    
    public void backTrack(int[] nums, List<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp)); // add a copy
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                backTrack(nums, temp, used);
                used[i] = false;
                temp.remove(temp.size() - 1); // backtrack
            }
        }
    }
}
