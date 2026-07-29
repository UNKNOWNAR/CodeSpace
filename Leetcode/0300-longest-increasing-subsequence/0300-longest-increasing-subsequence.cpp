class Solution {
public:
    int n;
    int lengthOfLIS(vector<int>& nums) {
        n = nums.size();
        vector<vector<int>> dp(n,vector<int>(n+1,-1));
        return findLength(0,0,nums,dp);
    }
    int findLength(int indx,int prevIndx,vector<int>& nums,vector<vector<int>>& dp){
        if(indx==n)
            return 0;
        if(dp[indx][prevIndx]!=-1)
            return dp[indx][prevIndx];
        int len = 0;
        //take
        if(prevIndx==0||nums[prevIndx-1]<nums[indx])
            len = 1+findLength(indx+1,indx+1,nums,dp);
        //not take
        len = max(len,findLength(indx+1,prevIndx,nums,dp));
        return dp[indx][prevIndx]=len;
    }
};