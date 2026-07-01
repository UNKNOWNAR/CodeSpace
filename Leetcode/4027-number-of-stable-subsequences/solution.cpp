class Solution {
    int modulo = 1e9+7;
    // dp[index][prevParity][count]
    int dp[100001][3][3];
public:
    int countStableSubsequences(vector<int>& nums) {
        for (int i = 0; i <= nums.size(); ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    dp[i][j][k] = -1;
                }
            }
}
        return helper(nums,0,2,0);
    }
private:
    int helper(vector<int>& nums,int indx,int prevParity,int count){
        if(indx==nums.size())
            return 0;
        if(dp[indx][prevParity][count]!=-1)
            return dp[indx][prevParity][count];
        int parity = nums[indx]%2;
        if(prevParity==parity){
            if(count==2)   return dp[indx][prevParity][count] = helper(nums,indx+1,prevParity,count);
            else{
                int pick = helper(nums,indx+1,parity,count+1)+1;
                int notPick = helper(nums,indx+1,parity,count);
                return dp[indx][prevParity][count] = (pick+notPick)%modulo;
            }
                
        }
        int pick = helper(nums,indx+1,parity,1)+1;
        int notPick = helper(nums,indx+1,prevParity,count);
        return dp[indx][prevParity][count] = (pick+notPick)%modulo;
    }

};
