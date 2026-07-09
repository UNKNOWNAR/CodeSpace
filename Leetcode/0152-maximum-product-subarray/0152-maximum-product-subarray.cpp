class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxSoFar = nums[0];
        int curMax = nums[0], curMin = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            int num = nums[i];
            if (num < 0) swap(curMax, curMin);
            curMax = max(num, curMax * num);
            curMin = min(num, curMin * num);
            maxSoFar = max(maxSoFar, curMax);
        }
        return maxSoFar;
    }
};