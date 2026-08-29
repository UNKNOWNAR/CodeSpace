class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int sum = 0,n = nums.size(),count = 0;
        vector<int> prefixSum(k,0);
        prefixSum[0] = 1;
        for(int i=0;i<n;i++){
            sum = ((sum+nums[i])%k+k)%k;
            count += prefixSum[sum];
            prefixSum[sum]++;
        }
        return count;
    }
};