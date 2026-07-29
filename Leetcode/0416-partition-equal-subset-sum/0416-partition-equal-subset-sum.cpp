class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int sum = 0;
        for(int num:nums)
            sum += num;
        if((sum&1)==1)
            return false;
        vector<vector<int>> dp(nums.size(),vector<int>((sum/2)+1,-1));
        return findSum(0,sum/2,nums,dp);
    }
    bool findSum(int indx,int sum,vector<int>& nums,vector<vector<int>>& dp){
        if(!sum)
            return true;
        if(indx==nums.size())
            return false;
        if(dp[indx][sum]!=-1)
            return dp[indx][sum];
        bool found = false;
        //take
        if(sum>=nums[indx])
            found |= findSum(indx+1,sum-nums[indx],nums,dp);
        //not take
        found |= findSum(indx+1,sum,nums,dp);
        return dp[indx][sum] = found;
    }
};