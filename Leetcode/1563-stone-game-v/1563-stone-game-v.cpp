class Solution {
public:
    int stoneGameV(vector<int>& stoneValue) {
        int sum = 0,n = stoneValue.size();
        for(int stone:stoneValue)
            sum += stone;
        vector<vector<int>> dp(n,vector<int>(n,-1));
        return solve(0,n-1,sum,stoneValue,dp);
    }
    int solve(int start,int end,int totalSum, vector<int>& stoneValue,vector<vector<int>>& dp){
        if(start==end)
            return 0;
        if(dp[start][end]!=-1)
            return dp[start][end];
        int maxScore = 0;
        int sum = 0;
        for(int i=start;i<end;i++){
            sum += stoneValue[i];
            if(2*sum<totalSum)
                maxScore = max(maxScore,sum+solve(start,i,sum,stoneValue,dp));
            else if(2*sum>totalSum)
                maxScore = max(maxScore,totalSum-sum+solve(i+1,end,totalSum-sum,stoneValue,dp));
            else
                maxScore = max(maxScore,max(sum+solve(start,i,sum,stoneValue,dp),totalSum-sum+solve(i+1,end,totalSum-sum,stoneValue,dp)));
        }
        return dp[start][end] = maxScore;
    }
};