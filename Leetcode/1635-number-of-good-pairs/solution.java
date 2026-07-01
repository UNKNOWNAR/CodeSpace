class Solution {
    public int numIdenticalPairs(int[] nums) {
        return fun(nums,0,1,0);
    }
    public int fun(int[] nums,int i,int j,int ans){
        if(i>=nums.length) return ans;
        if(j>=nums.length) return  fun(nums,i+1,i+2,ans);
        if(nums[i]==nums[j]) ans++;
        return fun(nums,i,j+1,ans);
    }
}
