class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0,max_val = -1e9;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
            max_val = max(max_val,sum);
            if(sum<0)
                sum = 0;
        }
        return max_val;
    }
};