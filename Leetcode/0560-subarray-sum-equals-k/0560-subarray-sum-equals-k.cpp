class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n = nums.size(),count = 0,prefixSum = 0;
        map<int,int> sum;
        sum[0] = 1;
        for(int r=0;r<n;r++){
            prefixSum += nums[r];
            if(sum.contains(prefixSum-k))
                count += sum[prefixSum-k];
            sum[prefixSum]++;
        }   
        return count;
    }
};