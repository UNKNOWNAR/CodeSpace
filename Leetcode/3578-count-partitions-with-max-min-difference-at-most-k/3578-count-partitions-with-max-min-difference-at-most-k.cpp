class Solution {
public:
    const int mod = 1e9+7;
    int countPartitions(vector<int>& nums, int k) {
        int n = nums.size(),i=0;
        vector<int> dp(n+1,0),prefixSum(n+1,0);
        deque<int> minEle,maxEle;
        dp[0] = 1;
        prefixSum[0] = 1;
        for(int j=0;j<nums.size();j++){
            while(!maxEle.empty()&&nums[j]>nums[maxEle.back()])
                maxEle.pop_back();
            maxEle.push_back(j);
            while(!minEle.empty()&&nums[j]<nums[minEle.back()])
                minEle.pop_back();
            minEle.push_back(j);
            while(i<=j&&nums[maxEle.front()]-nums[minEle.front()]>k){
                i++;
                while(maxEle.front()<i)
                    maxEle.pop_front();
                while(minEle.front()<i)
                    minEle.pop_front();
            }
            dp[j+1] = (prefixSum[j]-(i!=0?prefixSum[i-1]:0)+mod)%mod;
            prefixSum[j+1] = (dp[j+1]+prefixSum[j])%mod;
        }
        return dp[n];
    }
};