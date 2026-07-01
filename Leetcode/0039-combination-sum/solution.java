class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        Sum(new ArrayList<>(),target, candidates,0);
        return ans;
    }
    public void Sum(List<Integer> combination,int target,int[] candidates,int indx){
        while(indx<candidates.length){
            combination.add(candidates[indx]);
            if(candidates[indx]==target){
                ans.add(combination);
                return;
            }
            else if(candidates[indx]>target)
                return;
            Sum(new ArrayList<>(combination),target-candidates[indx], candidates,indx);
            combination.remove(combination.size()-1);
            indx++;
        }
    }
}
