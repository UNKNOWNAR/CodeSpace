class Solution {
public:
    int n;
    int rob(vector<int>& nums) {    
        n = nums.size();
        vector<vector<int>> dp(n,vector<int>(2,-1));
        return maxmProfit(0,nums,0,dp);
    }
    int maxmProfit(int indx,vector<int>& nums,int prevRobbed,vector<vector<int>>& dp){
        if(indx==n) return 0;
        if(dp[indx][prevRobbed]!=-1)
            return dp[indx][prevRobbed];
        int profit = 0;
        //take
        if(!prevRobbed)
            profit = nums[indx]+maxmProfit(indx+1,nums,1,dp);
        //not take
        profit = max(profit,maxmProfit(indx+1,nums,0,dp));
        return dp[indx][prevRobbed] = profit;
    }
};