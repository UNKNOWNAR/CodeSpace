class Solution {
public:
    int maxValidPairSum(vector<int>& nums, int k) {
        int n = nums.size(),maxi = 0,max_val = 0;
        for(int i=k;i<n;i++){
            maxi = max(maxi,nums[i-k]);
            max_val = max(max_val,nums[i]+maxi);
        }
        return max_val;
    }
};