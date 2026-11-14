class Solution {
public:
    int minimumSumSubarray(vector<int>& nums, int l, int r) {
        int min_sum = 1e9,n = nums.size();
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(j-i+1>=l&&j-i+1<=r&&sum>0)
                    min_sum = min(min_sum,sum);
            }
        }
        return min_sum==1e9?-1:min_sum;
    }
};