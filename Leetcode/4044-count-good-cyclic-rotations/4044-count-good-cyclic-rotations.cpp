class Solution {
    using ll = long long;
public:
    int countGoodRotations(vector<int>& nums) {
        int n = nums.size();
        vector<ll> nums1(2*n);
        for(int i=0;i<n;i++){
            nums1[i] = nums[i];
            nums1[i+n] = nums[i];
        }
        int count = 0;
        vector<ll> prefix_sum(2*n);
        prefix_sum[0] = nums[0];
        for(int i=1;i<2*n;i++)
            prefix_sum[i] = prefix_sum[i-1]+nums1[i];
        for(int i=0;i<n;i++){
            ll leftSum = prefix_sum[i+n/2-1];
            if(i>0)
                leftSum -= prefix_sum[i-1];
            ll rightSum = prefix_sum[i+n-1]-prefix_sum[i+n/2-1];
            if(leftSum>rightSum)
                count++;
        }
        return count;
    }
};