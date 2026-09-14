class Solution {
public:
    int n;
    string stoneGameIII(vector<int>& stoneValue) {
        n = stoneValue.size();
        vector<int> dp(n,-1);
        int diff = solve(0,dp,stoneValue);
        if(diff>0)
            return "Alice";
        else if(diff<0)
            return "Bob";
        else
            return "Tie";
    }
    int solve(int indx,vector<int>& dp,vector<int>& stoneValue){
        if(indx>=n)
            return 0;
        if(dp[indx]!=-1)
            return dp[indx];
        int score = -1e9;
        int sum = 0;
        for(int i=indx;i<min(indx+3,n);i++){
            sum += stoneValue[i];
            score = max(score,sum-solve(i+1,dp,stoneValue));
        }
        return dp[indx] = score;
    }
};