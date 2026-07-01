class Solution {
public:
    vector<int> maxValue(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        vector<int> left(n);
        vector<int> right(n);
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
            left[i] = max(left[i-1],nums[i]);
        for(int i=n-2;i>=0;i--)
            right[i] = min(right[i+1],nums[i]);
        ans[n-1] = left[n-1];
        for(int i=n-2;i>=0;i--){
            if(left[i]<=right[i+1])
                ans[i] = left[i];
            else
                ans[i] = ans[i+1];
        }
        return ans;
    }
};
