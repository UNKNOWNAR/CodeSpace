class Solution {
public:
    string text1,text2;
    int longestCommonSubsequence(string text1, string text2) {
        this->text1 = text1;
        this->text2 = text2;
        vector<vector<int>> dp(text1.size(),vector<int>(text2.size(),-1));
        return findLCS(0,0,dp);
    }
    int findLCS(int i,int j,vector<vector<int>>& dp){
        if(i==text1.size()||j==text2.size())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(text1[i]==text2[j])//match
            return dp[i][j] = 1+findLCS(i+1,j+1,dp);
        //skipBoth
        int len = findLCS(i+1,j+1,dp);
        //Skip1
        len = max(len,findLCS(i+1,j,dp));
        //Skip2
        len = max(len,findLCS(i,j+1,dp));
        return dp[i][j] = len;
    }
};