class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        createSubset(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void createSubset(int[] nums,int indx,List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        while(indx<nums.length){
            curr.add(nums[indx]);
            createSubset(nums,indx+1,curr,ans);
            curr.remove(curr.size()-1);
            int val = nums[indx];
            while(indx<nums.length&&val==nums[indx])
                indx++;
        }
    }
}
