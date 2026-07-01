class Solution {
    vector<int> dp;
public:
    int combinationSum4(vector<int>& nums, int target) {
        dp.assign(target+1,-1);
        return helper(nums,target);
    }
    int helper(vector<int>& nums,int target){
        if(dp[target]!=-1)
            return dp[target];
        int n = nums.size();
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==target)
                count++;
            else if(nums[i]>target)
                continue;
            else
                count += helper(nums,target-nums[i]);
        }
        return dp[target] = count;
    }
};
