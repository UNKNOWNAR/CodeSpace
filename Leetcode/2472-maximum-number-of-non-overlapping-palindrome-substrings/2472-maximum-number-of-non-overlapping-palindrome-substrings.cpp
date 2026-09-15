class Solution {
public:
    int maxPalindromes(string s, int k) {
        int n = s.length();
        if(k==1)
            return n;
        vector<vector<bool>> isPalindrome(n+1,vector<bool>(n+1));
        for(int l=1;l<=n;l++){
            for(int i=0;i+l<=n;i++){
                int j = i+l-1;
                if(i==j)
                    isPalindrome[i][j] = true;
                else if(i+1==j)
                    isPalindrome[i][j] = (s[i]==s[j]);
                else 
                    isPalindrome[i][j] = isPalindrome[i+1][j-1]&&(s[i]==s[j]);
            }
        }
        vector<vector<int>> dp(n+1,vector<int>(n+1));
        for(int l=n-1;l>=0;l--){
            for(int r=n-1;r>=0;r--){
                if(isPalindrome[l][r])
                    dp[l][r] = 1+(r+k<=n?dp[r+1][r+k]:0);
                dp[l][r] = max(dp[l][r],dp[l][r+1]);
                dp[l][r] = max(dp[l][r],dp[l+1][r+1]);
            }
        }  
        return dp[0][k-1];
    }
};